package com.zipcodewilmington.assessment2.part6;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.junit.*;

import java.sql.SQLException;

public class UserORMTest {
    private static UserApp userApp;
    private static ConnectionSource connectionSource;

    @BeforeClass
    public static void setupClass() throws SQLException {
        connectionSource = new JdbcConnectionSource("jdbc:h2:mem:users");
        TableUtils.createTable(connectionSource, User.class);
        userApp = new UserApp(connectionSource);
    }

    @AfterClass
    public static void tearDown() throws SQLException {
        if (connectionSource != null) {
            connectionSource.close();
        }
    }

    @Test
    public void testCreateAndFind() throws SQLException {
        String name = "Joy";
        User user = new User(name);
        long id = userApp.create(user);

        User actualUser = userApp.findById(id);

        Assert.assertEquals(id, actualUser.getId());
        Assert.assertEquals(name, actualUser.getName());
    }

    @Test
    public void testUpdate() throws SQLException {
        String name = "Ada";
        User user = new User("Lovelace");
        long id = userApp.create(user);
        userApp.updateName(id, name);

        User actualUser = userApp.findById(id);

        Assert.assertEquals(id, actualUser.getId());
        Assert.assertEquals(name, actualUser.getName());
    }
}

# Part 6 - ORM

## Section 1 - User
1. Setting database annotations
    1. Add the annotation to be associated with the database table `users`
    2. Add a `long id` field. Add the annotation to set it as database field. Column name is `id`. The field should be auto-generated.
    3. Add a `String name` field. Add the annotation to set it as database field. Column name is `name`. The field must not be null.
2. Create Constructor
    1. Create an empty contructor
    2. Create a contructor with a name `User(String name)`
    3. Create a contructor with id and name `User(long id, String name)`
3. Create/Generate getter and setter for the `id` and `name`

## Section 2 - UserApp
1. Creating a DAO
    1. Given a `ConnectionSource`, create a Dao for the user whose id is a Long (`Dao<User, Long>`)
2. `create` - use the Dao to create the user. The id should be set automatically
3. `findById` - given an id, find the user with that id
4. `updateName` - given an id and name, find the user associated with that id, set the user name to the new name, then update the user 

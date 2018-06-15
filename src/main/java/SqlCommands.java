

public class SqlCommands {

    /**
     * Select all the record from a table
     * @param tableName
     * @return SQL statement to select all the records
     */
    public String selectAll(String tableName){
        return null;
    }

    /**
     * Select all the data for a given column
     * @param tableName
     * @param column
     * @return SQL statement to get the column data
     */
    public String selectColumn(String tableName, String column) {
        return null;
    }

    /**
     * Select all the records whose column is the given value
     * @param tableName
     * @param column what to filter
     * @param value value to filter by
     * @return SQL statement to filter the data
     */
    public String selectWhere(String tableName, String column, String value) {
        return null;
    }

    /**
     * Count how many record is in the table.
     * @param tableName
     * @return SQL statement to count the record
     */
    public String count(String tableName) {
        return null;
    }
}

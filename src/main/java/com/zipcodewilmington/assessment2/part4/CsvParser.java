package com.zipcodewilmington.assessment2.part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class CsvParser {
    private static final Logger LOGGER = Logger.getLogger(CsvParser.class.getName());
    int id;
    String firstName;
    String lastName;
    String email;

    public CsvParser(int id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }



    /**
     * Given a string with fields separated by commas.
     * The fields are id, first name, last name, and email.
     * Parse the string and create a user using those fields.
     *
     * @param row String with fields separated by commas
     * @return User with data from the string
     * @throws BadDataException when the first field is not an integer
     *                          or when there are missing fields
     */
    protected User parseRow(String row) throws BadDataException {

        return null;
    }

    /**
     * Given a string representing the content of a CSV file.
     * Each row is separated by "\n".
     * The first row is the header. Ignore this row.
     * Map each row to a user.
     * @param csv String content of the a CSV
     * @return List<User>
     */
    public List<User> parseCsvString(String csv) {
        return null;
    }

    /**
     * Given a file path, read the content of the file, and parse it into a list of User.
     * @param filePath
     * @return List<User>
     * @throws IOException when file is not found or cannot read content
     */
    public List<User> parseFile(String filePath) throws IOException {
        return null;
    }
}

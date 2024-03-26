package service;

import model.Book;
import model.Medium;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the Connector interface and is used to make a connection to the database and is able to send SQL Queries to retrieve or update data
 */
public class SQLConnector implements Connector {

    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/library";
    private final String username = "admin";
    private final String password = "drakonov555";

    public SQLConnector() {
        this.connect();
    }

    @Override
    public void connect() {
        try {
            this.connection = DriverManager.getConnection(this.URL, this.username, this.password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method getMedia() uses connection to database to send a query that returns all of the data from table 'books'. It then returns a list of the result in the for of List<Medium>
     * @return returns a list of the media from the database table 'books'
     */
    public List<Medium> getMedia() {
        ArrayList<Medium> result = new ArrayList<>();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                Medium medium = new Book(resultSet.getString("title"),resultSet.getString("author"));
                result.add(medium);}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public void removeFromLibrary(String title) {
        // removes from books table on database by using title only
    }

    @Override
    public void addToLibrary(Medium medium) {
        // adds an object to the books table in the database
    }


}

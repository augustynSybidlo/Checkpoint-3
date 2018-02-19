package dao;

import model.Author;
import model.Book;
import model.Publisher;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibraryDBImpl implements LibraryDB {


    @Override
    public List<Book> findAllBooks() {
        Connection connection = ConnectionManager.getNewConnection();
        String url = "SELECT type_book.type FROM books " +
                "INNER JOIN authors ON books.author=authors.author_id " +
                "INNER JOIN  publishers ON books.publisher=publishers.publisher_id " +
                "INNER JOIN type_book ON books.type=type_book.type_id " +
                "WHERE books.author=authors.author_id AND " +
                "books.publisher=publishers.publisher_id;";
        Statement newStatement = null;
        ResultSet resultSet = null;
        List<Book> books = new ArrayList<>();
        Book newBook = null;
        Author author = null;
        Publisher publisher = null;
        String title;
        String type;
        int publicationYear;
        int isbn;
        double price;

        try {
            newStatement = connection.createStatement();
            resultSet = newStatement.executeQuery(url);
            while (resultSet.next()) {
                int authorId = resultSet.getInt("author_id");
                String authorCity = resultSet.getString("city");
                String authorCountry = resultSet.getString("country");
                String authorName = resultSet.getString("name");
                String authorSurname = resultSet.getString("surname");
                int birthdate = resultSet.getInt("birthday");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return books;
    }

    @Override
    public void updateBooks() {

    }


}

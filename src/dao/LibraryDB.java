package dao;

import model.Book;

import java.util.List;

public interface LibraryDB {

    List<Book> findAllBooks();
    void updateBooks();
}

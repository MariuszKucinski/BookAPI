package source.service;

import source.entity.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getBookList();
    void editBook(Book book);
    void deleteBook(long id);
    Book getBookById(long id);
}

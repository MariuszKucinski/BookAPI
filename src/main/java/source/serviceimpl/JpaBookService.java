package source.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.entity.Book;
import source.repositories.BookRepository;
import source.service.BookService;

import java.util.List;

@Service
public class JpaBookService implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public JpaBookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    @Override
    public void editBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book getBookById(long id) {
        return  bookRepository.getOne(id);
    }
}

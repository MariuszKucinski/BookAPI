package source.service;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;
import source.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockBookService {
    private List<Book> bookList;
    private long nextId = 4L;

    public MockBookService(){
        this.bookList = new ArrayList<>();
        bookList.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        bookList.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        bookList.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList){
        this.bookList = bookList;
    }


    public long getNextId() {
        return nextId;
    }

    public List<Book> showAllBooks(){
        return getBookList();
    }

    public List<Book> addBook(Book book){
        List<Book>  tmp = getBookList();
        tmp.add(book);
        this.setBookList(tmp);
        return getBookList();
    }

    public List<Book> editBook(long id, Book book){
        List<Book> tmp = getBookList();
        for(Book thing : tmp){
            if(thing.getId() == id){
                tmp.set(tmp.indexOf(thing),book);
            }
        }
        this.setBookList(tmp);
        return getBookList();
    }

    public List<Book> deleteBook(long id){
        List<Book> tmp = getBookList();
        tmp.remove(id);
        this.setBookList(tmp);
        return getBookList();
    }

    public Book getBookById(long id){
        List<Book> tmp = getBookList();
        for(Book book : tmp){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }



}

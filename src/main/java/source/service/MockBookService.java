package source.service;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;
import source.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MockBookService implements BookService {
    private static List<Book> bookList;
    private static long nextId = 4L;

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

    public void addBook(Book book){
        List<Book> tmp = this.getBookList();
        book.setId(nextId);
        tmp.add(book);
        this.setBookList(tmp);
        nextId++;
    }

    public void editBook(Book book){
        List<Book> tmp = getBookList();
        for(Book thing : tmp){
            if(thing.getId() == book.getId()){
                tmp.set(tmp.indexOf(thing),book);
            }
        }
        this.setBookList(tmp);
    }

    public void deleteBook(long id){
        getBookList().removeIf((el)->el.getId() == id);
    }

    public Book getBookById(long id){
        Book book = getBookList().stream().filter((el)->el.getId()==id).findFirst().orElse(null);
        return  book;
    }



}

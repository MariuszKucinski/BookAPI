package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import source.model.Book;
import source.service.MockBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private MockBookService mockBookService;

    @Autowired
    public BookController(){
        mockBookService = (mockBookService==null) ? new MockBookService() : mockBookService;
    }

   @GetMapping("")
   public List<Book> books(){
       return  mockBookService.getBookList();
   }

   @PostMapping("")
    public void addBook(@RequestBody Book book){
        mockBookService.addBook(book);
   }

   @PutMapping("")
   public void editBook(@RequestBody Book book){
        mockBookService.editBook(book);
   }

   @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id){
        mockBookService.deleteBook(id);
   }

   @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return mockBookService.getBookById(id);
   }


}

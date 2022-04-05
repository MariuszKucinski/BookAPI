package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import source.entity.Book;
import source.serviceimpl.JpaBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private JpaBookService jpaBookService;

    @Autowired
    public BookController(JpaBookService jpaBookService){
        this.jpaBookService = jpaBookService;
    }

   @GetMapping("")
   public List<Book> books(){
       return  jpaBookService.getBookList();
   }

   @PostMapping("")
    public void addBook(@RequestBody Book book){
       jpaBookService.addBook(book);
   }

   @PutMapping("")
   public void editBook(@RequestBody Book book){
       jpaBookService.editBook(book);
   }

   @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id){
       jpaBookService.deleteBook(id);
   }

   @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return jpaBookService.getBookById(id);
   }


}

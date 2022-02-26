package source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import source.model.Book;

@Controller
@RequestMapping("/books")
public class BookController {
   @RequestMapping("/helloBook")
   @ResponseBody
    public Book helloBook(){
       return new Book(1L, "9788324631766", "Thinking in Java",
               "Bruce Eckel", "Helion", "programming");
   }
}

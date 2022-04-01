package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import source.entity.Book;
import source.serviceimpl.JpaBookService;

import java.util.List;

@Controller
@RequestMapping("/admin/books")
public class ManageBookController {
    private JpaBookService bookService;

    @Autowired
    public ManageBookController(JpaBookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = bookService.getBookList();
        model.addAttribute("books", books);
        return "/books/all";
    }
}

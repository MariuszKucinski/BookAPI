package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import source.entity.Book;
import source.serviceimpl.JpaBookService;

import javax.transaction.Transactional;
import javax.validation.Valid;
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

    @GetMapping("/edit/{id:[1-9]{1}[0-9]{0,}}")
    @Transactional
    public String getEditBook(@PathVariable(name = "id")long id, Model model){
        model.addAttribute("book", bookService.getBookById(id));
        return "/books/add";
    }

    @GetMapping("/delete/{id:[1-9]{1}[0-9]{0,}}")
    public String getDeleteBook(@PathVariable(name = "id") long id){
        if(bookService.getBookById(id)!=null) {
            bookService.deleteBook(id);
        }
        return "redirect:/admin/books/all";
    }

    @GetMapping("/add")
    public String getAddBook(Model model){
        model.addAttribute("book", new Book());
        return "/books/add";
    }

    @PostMapping("/add")
    public String postAddBook(@Valid Book book, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/admin/books/add";
        }
        bookService.addBook(book);
        return "redirect:/admin/books/all";
    }

}

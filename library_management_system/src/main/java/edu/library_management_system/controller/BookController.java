package edu.library_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.library_management_system.service.BookService;
import edu.library_management_system_model.Book;

@Controller
public class BookController {
    @Autowired
    private BookService bookSer;

    @GetMapping("/books")
    public String viewBooks(Model model) {
        List<Book> books = bookSer.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/books/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/books/add")
    public String addBook(@ModelAttribute Book book) {
        bookSer.addBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBook(@PathVariable int id, Model model) {
        Book book = bookSer.getBookById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id));
        model.addAttribute("book", book);
        return "edit-book";
    }

    @PostMapping("/books/edit/{id}")
    public String updateBook(@PathVariable int id, @ModelAttribute Book book) {
        book.setId(id);
        bookSer.updateBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookSer.deleteBook(id);
        return "redirect:/books";
    }

    @GetMapping("/books/search")
    public String searchBooks(@RequestParam String name, Model model) {
        List<Book> books = bookSer.searchBooks(name);
        model.addAttribute("books", books);
        return "books";
    }
}

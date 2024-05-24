package edu.library_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.library_management_system.repository.BookRepository;
import edu.library_management_system_model.Book;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    @Transactional
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    @Transactional
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public List<Book> searchBooks(String name) {
        return bookRepository.findByName(name);
    }
}

package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        bookRepository.addBook(book);
        return "Book added successfully";
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookRepository.getBookById(id);
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody Book book) {
        bookRepository.updateBook(book);
        return "Book updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookRepository.deleteBook(id);
        return "Book deleted successfully";
    }
}
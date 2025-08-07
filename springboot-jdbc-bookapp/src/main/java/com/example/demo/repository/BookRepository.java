package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addBook(Book book) {
        String sql = "INSERT INTO books (bookname, author, price) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, book.getBookname(), book.getAuthor(), book.getPrice());
    }

    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    public Book getBookById(int id) {
        String sql = "SELECT * FROM books WHERE bookid=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
    }

    public int updateBook(Book book) {
        String sql = "UPDATE books SET bookname=?, author=?, price=? WHERE bookid=?";
        return jdbcTemplate.update(sql, book.getBookname(), book.getAuthor(), book.getPrice(), book.getBookid());
    }

    public int deleteBook(int id) {
        String sql = "DELETE FROM books WHERE bookid=?";
        return jdbcTemplate.update(sql, id);
    }
}
package com.db.service;

import com.db.entity.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);
    Book updateBook(Long id, Book book);
    Book getBookById(Long id);
    List<Book> getBooksByAuthor(String author);
    void deleteBook(Long id);
}

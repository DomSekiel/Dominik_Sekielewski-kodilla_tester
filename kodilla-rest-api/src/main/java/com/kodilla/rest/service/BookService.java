package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> getBooks();
    void addBook(BookDto bookDto);
    void removeBook(BookDto bookDto);
}
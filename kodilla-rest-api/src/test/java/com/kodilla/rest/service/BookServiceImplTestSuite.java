package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceImplTestSuite {

    @Test
    void shouldAddBook() {
        // Given
        BookServiceImpl bookService = new BookServiceImpl();
        BookDto book = new BookDto(
                "The Fellowship of the Ring",
                "J.R.R. Tolkien"
        );

        // When
        bookService.addBook(book);

        // Then
        List<BookDto> books = bookService.getBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    void shouldRemoveBook() {
        // Given
        BookServiceImpl bookService = new BookServiceImpl();
        BookDto book = new BookDto(
                "The Two Towers",
                "J.R.R. Tolkien"
        );
        bookService.addBook(book);

        // When
        bookService.removeBook(book);

        // Then
        assertTrue(bookService.getBooks().isEmpty());
    }

    @Test
    void shouldReturnBooks() {
        // Given
        BookServiceImpl bookService = new BookServiceImpl();

        BookDto book1 = new BookDto(
                "The Fellowship of the Ring",
                "J.R.R. Tolkien"
        );
        BookDto book2 = new BookDto(
                "The Two Towers",
                "J.R.R. Tolkien"
        );
        BookDto book3 = new BookDto(
                "The Return of the King",
                "J.R.R. Tolkien"
        );

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // When
        List<BookDto> books = bookService.getBooks();

        // Then
        assertEquals(3, books.size());
        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
    }
}
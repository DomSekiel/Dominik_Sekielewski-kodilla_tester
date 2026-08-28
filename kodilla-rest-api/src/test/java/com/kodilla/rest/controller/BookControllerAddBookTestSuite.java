package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookControllerAddBookTestSuite {

    @Mock
    BookService bookService;

    @InjectMocks
    BookController bookController;

    @Test
    void shouldAddBook() {
        //given
        BookDto bookDto = new BookDto("Title 1", "Author 1");

        //when
        bookController.addBook(bookDto);

        //then
        verify(bookService).addBook(bookDto);
    }
}
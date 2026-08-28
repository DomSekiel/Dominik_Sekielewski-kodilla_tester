package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    void shouldReturnBookData() {
        // Given
        Book book = new Book(
                "J.R.R. Tolkien",
                "Hobbit"
        );

        //When
        String Author = book.getAuthor();
        String Title = book.getTitle();

        //Then
        assertEquals("J.R.R. Tolkien", Author);
        assertEquals("Hobbit", Title);
    }

    @Test
    void shouldReturnBookRecordData() {
        // Given
        BookRecord bookRecord = new BookRecord(
                "J.R.R. Tolkien",
                "Hobbit",
                1937
        );

        //When
        String author = bookRecord.author();
        String title = bookRecord.title();
        int year = bookRecord.year();

        //Then
        assertEquals("J.R.R. Tolkien", author);
        assertEquals("Hobbit", title);
        assertEquals(1937, year);
    }
}
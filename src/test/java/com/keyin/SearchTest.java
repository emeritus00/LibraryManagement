package com.keyin;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {
    @Test
    void testSearchBook() {
        Library library = new Library();
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);

        Optional<Book> foundBook = library.searchBook("Effective Java");
        assertTrue(foundBook.isPresent());
        assertEquals("Joshua Bloch", foundBook.get().getAuthor());
    }
}

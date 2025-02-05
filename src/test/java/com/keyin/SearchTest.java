package com.keyin;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {
    @Test
    void testSearchBook() {
        Library library = new Library();
        Book book = new Book("Computational Java", "Kent Kelly");
        library.addBook(book);

        Optional<Book> foundBook = library.searchBook("Computational Java");
        assertTrue(foundBook.isPresent());
        assertEquals("Kent Kelly", foundBook.get().getAuthor());
    }
}

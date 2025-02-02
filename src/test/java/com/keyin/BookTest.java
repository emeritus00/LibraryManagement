package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {
    @Test
    void testBookAvailability() {
        Book book = new Book("Clean Code", "Robert C. Martin");
        assertTrue(book.isAvailable());
    }
}

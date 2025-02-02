package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {
    @Test
    void testUserBorrowingLimit() {
        User user = new User("John Doe");
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");
        Book book4 = new Book("Book 4", "Author 4");

        user.borrowBook(book1);
        user.borrowBook(book2);
        user.borrowBook(book3);

        assertFalse(user.canBorrow());
    }
}

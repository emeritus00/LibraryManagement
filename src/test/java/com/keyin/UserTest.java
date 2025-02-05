package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {
    @Test
    void testUserBorrowingLimit() {
        User user = new User("Yemi Loe");
        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author2");
        Book book3 = new Book("Book3", "Author3");

        user.borrowBook(book1);
        user.borrowBook(book2);
        user.borrowBook(book3);

        assertFalse(user.canBorrow());
    }
}

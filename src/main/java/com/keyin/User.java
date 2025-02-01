package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static final int MAX_BORROWED_BOOKS = 3;
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean canBorrow() {
        return borrowedBooks.size() < MAX_BORROWED_BOOKS;
    }

    public void borrowBook(Book book) {
        if (canBorrow() && book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        }
    }
}

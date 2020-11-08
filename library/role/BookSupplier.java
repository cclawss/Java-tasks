package com.company.library.role;

import com.company.library.Book;

public interface BookSupplier {
    void bringBook(Book book, Librarian librarian);
}

package com.company.BookStatus;

public class Book {
    public String title;
    public Status status;

    public Book(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

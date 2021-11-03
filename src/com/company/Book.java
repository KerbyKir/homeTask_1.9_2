package com.company;

public class Book {
    private String nameBook;
    private Author author;
    private int publicYearBook;

    public Book(String nameBook, Author author, int publicYearBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicYearBook = publicYearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicYearBook() {
        return publicYearBook;
    }

    public void setPublicYearBook(int publicYearBook) {
        this.publicYearBook = publicYearBook;
    }
}

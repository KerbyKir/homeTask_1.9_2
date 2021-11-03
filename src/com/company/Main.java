package com.company;

public class Main {

    //private static final Book [] arrayBooks = new Book[5];

    public static void main(String[] args) {
        Author author1 = new Author("Ivan","Ivanov");
        Author author2 = new Author("Petr","Petrov");

        Book book1;
        book1 = new Book("TestBook1",author1,2010);
        Book book2;
        book2 = new Book("TestBook2",author2,1806);

        book1.setPublicYearBook(2009);

        Library arrayBooks = new Library(5);

        arrayBooks.addNewBookToArray(book1);
        arrayBooks.addNewBookToArray(book2);

        arrayBooks.getInfoFromArrayBooks();

        arrayBooks.getInfoByNameBookFromArrayBooks(book1.getNameBook());
        arrayBooks.setPublicYearBookByNameBookFromArrayBooks(book1.getNameBook(),2011);
    }
}

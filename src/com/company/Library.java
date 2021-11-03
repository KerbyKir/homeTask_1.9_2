package com.company;

import java.util.Objects;

public class Library {
    private static Book [] arrayBooks;

    public Library(int arrayLength) {
        arrayBooks = new Book[arrayLength];
    }

    public void addNewBookToArray(Book addingBook) {
        for(int i=0;i<arrayBooks.length;i++){
            if(arrayBooks[i] == null) {
                arrayBooks[i] = addingBook;
                break;
            } else if (i==arrayBooks.length-1) {
                System.out.println("В массиве нет свободных мест");
            }
        }
    }

    public void getInfoFromArrayBooks() {
        for (Book arrayBook : arrayBooks) {
            if (arrayBook != null) {
                String nameBook = arrayBook.getNameBook();
                String firstNameAuthor = arrayBook.getAuthor().getFirstNameAuthor();
                String secondNameAuthor = arrayBook.getAuthor().getSecondNameAuthor();
                int publicYearBook = arrayBook.getPublicYearBook();
                System.out.print('"' + firstNameAuthor + ' ' + secondNameAuthor + ": "
                        + nameBook + ": " + publicYearBook + '"');
                System.out.print("\n");
            }
        }
    }

    public void getInfoByNameBookFromArrayBooks(String nameBook) {
        for (Book arrayBook : arrayBooks) {
            if (arrayBook != null && Objects.equals(arrayBook.getNameBook(), nameBook)) {
                String firstNameAuthor = arrayBook.getAuthor().getFirstNameAuthor();
                String secondNameAuthor = arrayBook.getAuthor().getSecondNameAuthor();
                int publicYearBook = arrayBook.getPublicYearBook();
                System.out.println(nameBook + " by " + firstNameAuthor + ' ' + secondNameAuthor
                        + " was published in " + publicYearBook + '"');
                break;
            }
        }
    }

    public void setPublicYearBookByNameBookFromArrayBooks(String nameBook, int publicYearBook) {
        for (Book arrayBook : arrayBooks) {
            if (arrayBook != null && Objects.equals(arrayBook.getNameBook(), nameBook)) {
                arrayBook.setPublicYearBook(publicYearBook);
            }
        }
    }
}

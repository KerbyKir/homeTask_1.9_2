package com.company;

public class Author {
    private String firstNameAuthor;
    private String secondNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.secondNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getSecondNameAuthor() {
        return secondNameAuthor;
    }
}

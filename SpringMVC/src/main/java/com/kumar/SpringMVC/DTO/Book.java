package com.kumar.SpringMVC.DTO;


public class Book {

    private String Title;
    private String Author;

    public Book() {
    }

    public Book(String title, String author) {
        Title = title;
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}

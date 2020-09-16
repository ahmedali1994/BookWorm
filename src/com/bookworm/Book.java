package com.bookworm;

public class Book {
    private String title;
    private String author;
    private String yearPublished;
    private double sellPrice;

    public Book(String title, String author, String yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public Book(String title, String author, String yearPublished, double sellPrice) {
        this(title,author,yearPublished);
        this.sellPrice = sellPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public double getSellPrice() {
        return sellPrice;
    }

}

package com.bookworm;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books = new ArrayList<>();
    private List<Integer> quantity = new ArrayList<>();
    private List<Integer> inventoryNumber = new ArrayList<>();

    public Inventory(Book book, int quantity, int inventoryNumber) {
        this.books.add(book);
        this.quantity.add(quantity);
        if (inventoryNumber != 0)
        {
            this.inventoryNumber.add(0);
        }
        else
            {
                this.inventoryNumber.add(inventoryNumber);
            }
    }

    public void addBook(Book book,int quantity)
    {
        int x = inventoryNumber.size() +1;
        this.books.add(book);
        this.quantity.add(quantity);
        this.inventoryNumber.add(x);
    }

    public void display(String title)
    {
        for (Book book:books)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                int x = books.indexOf(book);
                System.out.println(book.getAuthor() + book.getTitle());
                System.out.println(quantity.get(x));
                System.out.println(inventoryNumber.get(x));
            }
        }
    }
}

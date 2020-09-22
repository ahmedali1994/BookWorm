package com.bookworm;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private  Book book;
    private  int quantity;
    private int inventoryNumber;

    public Inventory(Book book, int quantity, int inventoryNumber)
    {
        this.book = book;
        this.quantity = quantity;
        if (inventoryNumber != 0)
        {
            this.inventoryNumber = 0;
        }else
            {
                this.inventoryNumber = inventoryNumber;
            }

    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber)
    {
        this.inventoryNumber = inventoryNumber;
    }



}

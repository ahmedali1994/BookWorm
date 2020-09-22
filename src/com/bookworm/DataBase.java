package com.bookworm;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private int inventoryCount;
    List<Inventory> inventoryList = new ArrayList<>();
    public DataBase(Inventory inventory)
    {
        this.inventoryList.add(inventory);
        inventory.setInventoryNumber(inventoryCount++);
    }
    public void addInventory(Inventory inventory)
    {
        this.inventoryList.add(inventory);
        inventory.setInventoryNumber(inventoryCount++);
    }
    public void removeInventory(int inventoryNumber)
    {

        if (inventoryNumber >= this.inventoryList.size())
        {
            System.out.println("Inventory does not exist");
        }else
            {
                for (Inventory inventory : inventoryList)
                {
                    if (inventory.getInventoryNumber() == inventoryNumber)
                    {
                        this.inventoryList.remove(inventory);
                        break;

                    }
                }

            }
    }
    public void printInventories()
    {
        for (Inventory inventory : inventoryList)
        {
            System.out.println("Inventory Number: " + inventory.getInventoryNumber() + " Quantity: " + inventory.getQuantity() +"\n" +
                               " Title: " + inventory.getBook().getTitle() + "\n" +
                               " Author: " + inventory.getBook().getAuthor() + "\n" +
                               " Year Published: "+ inventory.getBook().getYearPublished()+"\n" +
                               " Price: " + inventory.getBook().getSellPrice());
        }
    }
}

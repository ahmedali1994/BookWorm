package com.bookworm;

public class Main {
    public static void main(String[] args) {
        Book java = new Book("java","alex","2008");
        Book java1 = new Book("java1","alex","2010");
        Book java2 = new Book("java2","alex","2012");
        Inventory inventory = new Inventory(java,20,0);
        Inventory inventory2 = new Inventory(java1,20,0);
        Inventory inventory3 = new Inventory(java2,20,0);
        DataBase dataBase = new DataBase(inventory);
        dataBase.addInventory(inventory2);
        dataBase.addInventory(inventory3);
        dataBase.printInventories();
        System.out.println("===========================================");
        dataBase.removeInventory(0);
        dataBase.printInventories();

    }
}

package com.bookworm;

public class Main {
    public static void main(String[] args) {
        Book java = new Book("java","alex","2008");
        Book java1 = new Book("java1","alex","2010");
        Book java2 = new Book("java2","alex","2012");
        Inventory inventory = new Inventory(java,20,0);

    }
}

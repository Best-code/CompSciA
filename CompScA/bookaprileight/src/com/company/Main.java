package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Annabel Bass", "Okay for now", 812);
    }
}

class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }


}
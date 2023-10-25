package com.company;

public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int numOfAvailables;
    private double price;
    Book(){
        this.title="";
        this.author=new Author();
        this.type=BookType.BOOK;
        this. numOfAvailables=0;
        this.price=0;
    }
    Book(String title,Author author, BookType type, int numOfAvailables,double price ){
        this.title=title;
        this.author=author;
        this.type=type;
        this. numOfAvailables=numOfAvailables;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

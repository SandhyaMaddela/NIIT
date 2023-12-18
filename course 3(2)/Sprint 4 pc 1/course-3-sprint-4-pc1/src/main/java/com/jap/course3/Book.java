package com.jap.course3;

public class Book {
    private int isbnNumber;
    private String bookTitle;
    private String bookDescription;
    private int price;
    private Author author;
    //Has-A relationShip b/w book and author
    public int getIsbnNumber() {
        return this.isbnNumber;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookDescription() {
        return this.bookDescription;
    }

    public int getPrice() {
        return this.price;
    }

    public Author getAuthor() {
        return author;
    }
    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void displayBookDetails(){
        System.out.println("Book Number is "+isbnNumber);
        System.out.println("Book Title is "+bookTitle);
        System.out.println("Book Description is "+bookDescription);
        System.out.println("Price of a book is :"+price);
        System.out.println(author);
    }
}

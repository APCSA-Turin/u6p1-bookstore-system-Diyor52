package com.example.project;

// The Book class represents a book with attributes like title, author, year of publication, ISBN, and quantity.
public class Book {
    // Declaring private attributes for the Book class.
    // These attributes store information about the book.
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    // Constructor that initializes the attributes of the Book class.
    // It requires 5 parameters: title, author, yearPublished, isbn, and quantity.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title; // Assign the title parameter to the title attribute
        this.author = author; // Assign the author parameter to the author attribute
        this.yearPublished = yearPublished; // Assign the yearPublished parameter to the yearPublished attribute
        this.isbn = isbn; // Assign the isbn parameter to the isbn attribute
        this.quantity = quantity; // Assign the quantity parameter to the quantity attribute
    }

    // Getter method for the title attribute.
    // Returns the current title of the book.
    public String getTitle() {
        return title;
    }

    // Setter method for the title attribute.
    // Allows updating the title of the book.
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    // Getter method for the author attribute.
    // Returns the current author of the book.
    public String getAuthor() {
        return author;
    }

    // Setter method for the author attribute.
    // Allows updating the author of the book.
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    // Getter method for the yearPublished attribute.
    // Returns the year the book was published.
    public int getYearPublished() {
        return yearPublished;
    }

    // Setter method for the yearPublished attribute.
    // Allows updating the year the book was published.
    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }

    // Getter method for the ISBN attribute.
    // Returns the ISBN (International Standard Book Number) of the book.
    public String getIsbn() {
        return isbn;
    }

    // Setter method for the ISBN attribute.
    // Allows updating the ISBN of the book.
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    // Getter method for the quantity attribute.
    // Returns the number of copies of the book available.
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the quantity attribute.
    // Allows updating the quantity of the book 
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    // Method to generate a string containing the book's information.
    // Returns a formatted string with title, author, year, ISBN, and quantity.
    public String bookInfo() {
        return "Title: " + title + ", " + "Author: " + author + ", " + "Year: " + yearPublished + ", " + "ISBN: " + isbn + ", " + "Quantity: " + quantity;
    }
}
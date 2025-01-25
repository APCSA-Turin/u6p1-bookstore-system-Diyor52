package com.example.project;

public class User {
    // Private attributes for name, Id, and a list of books (initialized to an array of 5 empty slots).
    private String name;
    private String Id;
    private Book[] bookList = new Book[5];

    // Constructor to initialize the user's name and Id.
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    // Getter and setter for the name attribute.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for the Id attribute.
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    // Getter and setter for the bookList array.
    public Book[] getBooks() {
        return bookList;
    }
    public void setBooks(Book[] bookList) {
        this.bookList = bookList;
    }

    // Generates a string with information about the user's books.
    // If the slot is empty, it will display "empty".
    public String bookListInfo() {
        String result = "";
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                result += "empty\n";  // Indicates that the slot is empty.
            } else {
                result += bookList[i].bookInfo() + "\n";  // Displays book information if a book exists.
            }
        }
        return result;
    }

    // Returns a summary of the user's information, including their books.
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }
}
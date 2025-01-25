package com.example.project;

public class BookStore {
    // Declaring two attributes: 
    // books is a dynamic array (can grow in size) that will hold Book objects.
    private Book[] books = new Book[0]; // Initially an empty array
    // users is a static array (fixed size) that can hold up to 10 User objects.
    private User[] users = new User[10]; // Array with a maximum of 10 users
    
    // Empty constructor for the BookStore class.
    // Initializes the books and users arrays when a new BookStore is created.
    public BookStore() {}

    // Getter method for the users array.
    // Returns the array of users currently stored in the BookStore.
    public User[] getUsers() {
        return users;
    }

    // Setter method for the users array.
    // Allows setting or updating the entire array of users.
    public void setUsers(User[] users) {
        this.users = users;
    }

    // Getter method for the books array.
    // Returns the array of books currently stored in the BookStore.
    public Book[] getBooks() {
        return books;
    }

    // Adds a new user to the users array.
    // Iterates over the array to find the first empty slot (null) and adds the user.
    // Then it calls consolidateUsers to clean up the array by shifting non-null users.
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user; // Adds the user in the first empty slot
                consolidateUsers(); // Calls consolidate to rearrange users
                return;
            }
        }
    }

    // Removes a user from the users array.
    // Finds the user and sets that index to null.
    // Then it consolidates the array by shifting remaining users.
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null; // Removes the user by setting their slot to null
                consolidateUsers(); // Calls consolidate to rearrange users
                return;
            }
        }
    }

    // Consolidates the users array by shifting non-null elements to the left.
    // This method is used after adding or removing users to ensure the array remains compact (no gaps).
    public void consolidateUsers() {
        int nextEmpty = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (i != nextEmpty) {
                    users[nextEmpty] = users[i]; // Shifts the user to the next empty position
                    users[i] = null; // Sets the old position to null
                }
                nextEmpty++;
            }
        }
    }

    // Adds a new book to the books array.
    // Creates a new array with one additional slot, copies over existing books, 
    // and adds the new book in the new array.
    // Since books is a dynamic array, it can expand in size as more books are added.
    public void addBook(Book book) {
        int newLength = books.length + 1; // Increases array size by 1
        Book[] newBooks = new Book[newLength]; // Creates a new array to accommodate the new book
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i]; // Copies existing books into the new array
        }
        newBooks[newLength - 1] = book; // Adds the new book at the end
        books = newBooks; // Replaces the old array with the new one
    }

    // Inserts a new book at a specific index in the books array.
    // It creates a new array that is one element larger, 
    // shifts the books around to make room for the new book, 
    // and places it at the specified index.
    public void insertBook(Book book, int index) {
        Book[] newBooks = new Book[books.length + 1]; // Creates a new array with one extra space
        for (int i = 0; i < index; i++) {
            newBooks[i] = books[i]; // Copies books before the specified index
        }
        for (int i = index + 1; i < newBooks.length; i++) {
            newBooks[i] = books[i - 1]; // Shifts books after the specified index
        }
        newBooks[index] = book; // Inserts the new book at the specified index
        books = newBooks; // Replaces the old array with the new one
    }

    // Removes a book from the books array.
    // If the quantity of the book is 1, it removes the book from the array completely.
    // Otherwise, it just decreases the quantity of the book by 1.
    public void removeBook(Book book) {
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                index = i; // Finds the index of the book to be removed
            }
        }
        if (books[index].getQuantity() == 1) {
            Book[] newList = new Book[books.length - 1]; // Creates a new array to remove the book
            for (int i = 0; i < index; i++) {
                newList[i] = books[i]; // Copies books before the specified index
            }
            for (int i = index + 1; i < books.length; i++) {
                newList[i - 1] = books[i]; // Copies books after the specified index
            }
            books = newList; // Replaces the old array with the new one
        } else {
            books[index].setQuantity(books[index].getQuantity() - 1); // Decreases the quantity if more than 1
        }
    }

    // Returns a string containing detailed information about all books in the bookstore.
    // Calls the bookInfo method for each book to retrieve its details.
    public String bookStoreBookInfo() {
        String result = "";
        for (int i = 0; i < books.length; i++) {
            result += books[i].bookInfo() + "\n"; // Adds book information to the result string
        }
        return result;
    }

    // Returns a string containing detailed information about all users in the bookstore.
    // Calls the userInfo method for each user to retrieve their details.
    public String bookStoreUserInfo() {
        String result = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                result += users[i].userInfo() + "\n"; // Adds user information to the result string
            }
        }
        return result;
    }
}
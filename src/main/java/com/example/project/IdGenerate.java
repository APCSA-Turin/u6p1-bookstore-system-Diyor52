package com.example.project;

public class IdGenerate{ // This class contains static variables and methods, you do not need to initialize an object to use it.
    
    // Private static attribute 'currentId', initialized to "99". 
    // This will be used to keep track of the current ID as a string.
    private static String currentId = "99"; 

    // Empty constructor for the IdGenerate class.
    // Not needed to initialize the static variable, but it's included as required.
    public IdGenerate(){}

    // Getter method to retrieve the current ID.
    // It returns the value of 'currentId' as a string.
    public static String getCurrentId(){
        return currentId;
    }

    // Method to reset the 'currentId' back to "99".
    // This allows for resetting the ID generation process.
    public static void reset(){
        currentId = "99"; // Resets the static 'currentId' to "99"
    }

    // Method to generate a new ID.
    // This will increment the 'currentId' by 1 each time it's called.
    // The ID is stored as a string, so it first converts the string to an integer, increments it, 
    // and then converts it back to a string.
    public static void generateID(){
        // Converts the current 'currentId' string to an integer and adds 1 to it.
        int newValue = Integer.valueOf(currentId) + 1; // https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
        // Updates 'currentId' by converting the new integer value back to a string.
        currentId = "" + newValue; // Concatenates an empty string to convert the integer to a string.
    }
}
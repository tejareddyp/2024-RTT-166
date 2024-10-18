package org.perscholas;

public class CustomException extends Exception {
    //when making a custom exception the naming practice is to always end with the word exception
    //1. Extends exception
    //2. we create a constructor that takes a string and calls super to initialize the parent
    public CustomException(String message) {
        super(message);
    }
}

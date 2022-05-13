package com.project.Library.Management.Application.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(int id) {
        super("User id not found: "+id);

    }
}

package com.project.Library.Management.Application.utils;

import com.project.Library.Management.Application.model.User;

public class UserValidator {
    public boolean isValidUser(User user){
        if(user.getEmail()==null || user.getEmail()==""){
            return false;
        }
        return true;
    }
}

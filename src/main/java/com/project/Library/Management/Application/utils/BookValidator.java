package com.project.Library.Management.Application.utils;

import com.project.Library.Management.Application.model.Book;

public class BookValidator {
    public boolean isValidBook(Book book){
        if(book.getTitle()=="" || book.getTitle()==null){
            return false;
        }
        return true;
    }
}

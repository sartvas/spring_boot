package org.example.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Book was taken");
    }
}

package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook(){
        System.out.println("Book was taken");
    }
}

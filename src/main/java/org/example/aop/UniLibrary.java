package org.example.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    @Before("allGetMethodsFromUnilibruary()")
    public void getBook(){
        System.out.println("From UniLibrary was taken book");
    }


    @Before("allGetMethodsFromUnilibruary()")
    public void getMagazine(){
        System.out.println("From UniLibrary was taken magazine ");
    }
//    public void getBook(Book book){
//        System.out.println("From UniLibrary was taken book " + book.getName());
//    }

    @Before("allReturnMethodsFromUnilibruary()")
    public void returnBook(){
        System.out.println("Book was returned to UniLibrary");
    }

    @Before("allReturnMethodsFromUnilibruary()")
    public void returnMagazine(){
        System.out.println("Magazine was returned to UniLibrary");
    }

    @Before("allAddMethodsFromUnilibruary()")
    public void addBook(){
        System.out.println("Book was added in UniLibrary");
    }

    @Before("allAddMethodsFromUnilibruary()")
    public void addMagazine(){
        System.out.println("Magazine was added in UniLibrary");
    }
}

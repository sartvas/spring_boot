package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("From UniLibrary was taken book");
    }

    public void getMagazine(){
        System.out.println("From UniLibrary was taken magazine ");
    }
//    public void getBook(Book book){
//        System.out.println("From UniLibrary was taken book " + book.getName());
//    }

    public void returnBook(){
        System.out.println("Book return to UniLibrary");
    }
}

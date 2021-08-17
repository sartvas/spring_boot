package org.example.aop.aspects;

import org.example.aop.AbstractLibrary;

public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Somebody trying to take a book from SchoolLibrary");
    }
}

package org.example.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Nightmare on the Vyazov.st")
    private String name;

    public String getName() {
        return name;
    }
}

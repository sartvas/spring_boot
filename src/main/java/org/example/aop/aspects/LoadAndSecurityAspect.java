package org.example.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoadAndSecurityAspect {

    @Before("execution(* get*())")
    // public void getBook(org.example.aop.Book, ..) - если параметр - это класс, пишем весь путь и .. или см. ниже
    // public void *(*) - 1 любое имя с любым одним пареметром
    // public void *(..) - 1 любое имя с любым количеством пареметров
    public void beforeGetLogingAdvice(){
        System.out.println("Somebody trying to take a book/magazine from library");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("Somebody trying to return a book to library");
    }

    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice(){
        System.out.println("Check security");
    }
}

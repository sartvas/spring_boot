package org.example.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoadAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    // public void getBook(org.example.aop.Book, ..) - если параметр - это класс, пишем весь путь и .. или см. ниже
    // public void *(*) - 1 любое имя с любым одним пареметром
    // public void *(..) - 1 любое имя с любым количеством пареметров
    public void beforeGetLogingAdvice(){
        System.out.println("Somebody trying to take a book/magazine from library");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("Check security");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("Somebody trying to return a book to library");
    }


}

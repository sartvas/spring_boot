package org.example.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoadAspects {

    @Before("execution(public void getBook()))")
    public void beforeGetBookAdvice(){
        System.out.println("Somebody try to take a book");
    }
}

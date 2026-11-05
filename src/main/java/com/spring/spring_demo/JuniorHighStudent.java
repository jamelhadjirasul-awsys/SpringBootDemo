package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
@Lazy 
public class JuniorHighStudent implements Student{
    
    public JuniorHighStudent() {
        System.out.println("In contructor:" + getClass().getSimpleName());
    }
    
    @Override 
    public String getDailyAssignment() {
        return "Study Spring Boot coding";
    }
}

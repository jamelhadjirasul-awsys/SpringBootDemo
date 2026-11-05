package com.spring.spring_demo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;

@RestController 
public class SampleRestController {

    // define a private field for the dependency
    private Student myStudent;
    private Student anotherStudent;

    public SampleRestController(@Qualifier ("elementaryStudent") Student student) {
        myStudent = student;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    

    @GetMapping("/check")
    public String getScope() {
        return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    }

    @GetMapping("/assignment")
    public String getAssignment() {
        return myStudent.getDailyAssignment();
    }
    

    // public SampleRestController(@Qualifier("universityStudent") Student student, 
    //                             @Qualifier("universityStudent") Student student_two) {
    //     myStudent = student;
    //     anotherStudent = student_two;
    // }
    
    // // define a constructor for dependency injection
    // public SampleRestController(Student theStudent) {
    //     myStudent = theStudent;
    // }

    // @Autowired
    // public void setStudent(@Qualifier("universityStudent") Student student) {
    //     myStudent = student;
    // }
    

}

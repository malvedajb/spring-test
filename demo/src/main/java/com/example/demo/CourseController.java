package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CourseController {

    @GetMapping("courses")
    public String getMethodName() {
        return  "Hello World!";
    }
    
}

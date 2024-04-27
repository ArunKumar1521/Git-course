package com.Arun.firstApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping(path ="/hello" )
    public List<Course> getCourses(){
        return Arrays.asList(
            new Course(1, "HTML", "Kumar"),
            new Course(2, "CSS", "Arun"),
            new Course(3, "Java script", "Thala"),
            new Course(4, "Java", "Sowmya K")
        );
    }
}

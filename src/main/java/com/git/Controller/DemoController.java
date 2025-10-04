package com.git.Controller;

import com.git.Dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private Student student;

    @GetMapping("/demo")
    public String helloWorld() {
        return "Good morning "+student.getSurname();
    }
    @GetMapping("/hi")
    public String helloWorld() {
        return "hi "+student.getSurname();
    }
}

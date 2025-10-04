package com.git.Controller;

import com.git.Dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodMorningController {

    @Autowired
    private Student student;

    @GetMapping("/good")
    public String helloWorld() {
        return "Good morning "+student.name;
    }
}

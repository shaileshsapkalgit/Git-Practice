package com.git.Dto;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public String name="shailesh";
    public String surname="sapkal";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

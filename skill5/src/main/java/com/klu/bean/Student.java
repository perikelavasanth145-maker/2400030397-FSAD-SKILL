package com.klu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 101;
    private String name = "Rex";
    private String gender = "Male";

    @Autowired
    private Certification certification;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", gender=" + gender +
                ", certification=" + certification + "]";
    }
}
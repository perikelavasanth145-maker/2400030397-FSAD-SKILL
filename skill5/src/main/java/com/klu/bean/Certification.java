package com.klu.bean;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "Java Spring Certification";
    private String dateOfCompletion = "2026-03-01";

    public Certification() {
    }

    @Override
    public String toString() {
        return "Certification [id=" + id + 
               ", name=" + name + 
               ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}
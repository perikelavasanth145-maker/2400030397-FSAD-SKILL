package com.klu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.klu.beans.Student;

@Configuration
public class AppConfig {

    @Bean
    public Student studentBean() {
        return new Student(102, "Alex", "Data Science", 2);
    }
}
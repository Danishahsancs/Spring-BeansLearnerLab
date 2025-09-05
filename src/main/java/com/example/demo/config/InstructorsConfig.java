package main.java.com.example.demo.config;

import main.java.com.example.demo.model.Instructor;
import main.java.com.example.demo.model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors(
            new Instructor(100L, "Prof. Smith"),
            new Instructor(101L, "Prof. Johnson")
        );
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors(
            new Instructor(200L, "Dr. Brown"),
            new Instructor(201L, "Dr. Green")
        );
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {
        return new Instructors(
            new Instructor(300L, "Kris"),
            new Instructor(301L, "Paul")
        );
    }
}

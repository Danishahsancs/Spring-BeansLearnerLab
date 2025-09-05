package main.java.com.example.demo.config;

import main.java.com.example.demo.model.Student;
import main.java.com.example.demo.model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students") ///bean is called students
    public Students currentStudents() {
        return new Students(
            new Student(1L, "Alice"),
            new Student(2L, "Bob"),
            new Student(3L, "Charlie")
        );
    }

    @Bean
    public Students previousStudents() {///beans default name is previousStudents
        return new Students(
            new Student(4L, "Dana"),
            new Student(5L, "Eve")
        );
    }
}

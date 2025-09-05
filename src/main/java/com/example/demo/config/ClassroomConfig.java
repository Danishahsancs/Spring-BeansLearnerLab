package main.java.com.example.demo.config;

import main.java.com.example.demo.model.Classroom;
import main.java.com.example.demo.model.Instructors;
import main.java.com.example.demo.model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"students", "instructors"})
    public Classroom currentCohort(Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort(Students previousStudents, Instructors instructors) {
        return new Classroom(previousStudents, instructors);
    }
}

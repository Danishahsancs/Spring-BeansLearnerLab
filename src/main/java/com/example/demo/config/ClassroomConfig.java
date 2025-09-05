package com.example.demo.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.example.demo.model.Classroom;
import com.example.demo.model.Instructors;
import com.example.demo.model.Students;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"students", "instructors"})
    public Classroom currentCohort(@Qualifier("students") Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort(@Qualifier("previousStudents") Students previousStudents, Instructors instructors) {
        return new Classroom(previousStudents, instructors);
    }
}

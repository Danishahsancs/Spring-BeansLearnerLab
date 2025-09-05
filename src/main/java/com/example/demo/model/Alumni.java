package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;

@Component
public class Alumni {

    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("previousStudents") Students previousStudents, Instructors instructors) {
        this.students = previousStudents;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp() {
        double totalHoursPerStudent = 1200.0;
        double numberOfStudents = students.size();
        double numberOfInstructors = instructors.size();

        // total teaching hours across all students
        double totalTeachingHours = totalHoursPerStudent * numberOfStudents;
        double hoursPerInstructor = totalTeachingHours / numberOfInstructors;

        for (Instructor instructor : instructors) {
            instructor.lecture(students, hoursPerInstructor);
        }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}

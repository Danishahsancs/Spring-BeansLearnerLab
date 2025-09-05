package com.example.demo;

import com.example.demo.model.Alumni;
import com.example.demo.model.Student;
import com.example.demo.model.Students;
import com.example.demo.model.Instructors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestAlumni {

    @Autowired
    private Alumni alumni;

    @Test
    void testBootcampHoursDistributed() {
        Students students = alumni.getStudents();
        Instructors instructors = alumni.getInstructors();

        double expectedTotalHours = 1200.0;

        // Check each student received 1200 hours
        for (Student student : students) {
            assertEquals(expectedTotalHours, student.getTotalStudyTime(), 0.01);
        }

        // Optional: Check hours per instructor (derived dynamically)
        int numberOfStudents = students.size();
        int numberOfInstructors = instructors.size();
        double expectedHoursPerInstructor = (expectedTotalHours * numberOfStudents) / numberOfInstructors;

        // You could loop over instructors if you track hours taught per instructor
        // (only if your Instructor class stores this info)
    }
}

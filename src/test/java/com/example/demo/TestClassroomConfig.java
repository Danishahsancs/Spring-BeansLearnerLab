package com.example.demo;

import com.example.demo.config.ClassroomConfig;
import com.example.demo.config.InstructorsConfig;
import com.example.demo.config.StudentConfig;
import com.example.demo.model.Classroom;
import com.example.demo.model.Students;
import com.example.demo.model.Instructors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {ClassroomConfig.class, StudentConfig.class, InstructorsConfig.class})
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentClassroom;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousClassroom;

    @Test
    void testCurrentClassroomContents() {
        assertNotNull(currentClassroom);
        Students students = currentClassroom.getStudents();
        Instructors instructors = currentClassroom.getInstructors();

        assertEquals("Alice", students.findById(1L).getName());
        assertEquals("Bob", students.findById(2L).getName());
        assertEquals("Charlie", students.findById(3L).getName());

        assertEquals("Kris", instructors.findById(300L).getName());
        assertEquals("Paul", instructors.findById(301L).getName());
    }

    @Test
    void testPreviousClassroomContents() {
        assertNotNull(previousClassroom);
        Students students = previousClassroom.getStudents();
        Instructors instructors = previousClassroom.getInstructors();

        assertEquals("Dana", students.findById(4L).getName());
        assertEquals("Eve", students.findById(5L).getName());

        assertEquals("Kris", instructors.findById(300L).getName());
        assertEquals("Paul", instructors.findById(301L).getName());
    }
}

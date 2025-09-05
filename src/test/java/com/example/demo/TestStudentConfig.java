package com.example.demo;

import com.example.demo.config.StudentConfig;
import com.example.demo.model.Student;
import com.example.demo.model.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = StudentConfig.class)
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    private Students previousStudents;

    @Test
    void testCurrentStudentsContents() {
        assertNotNull(currentStudents);

        assertEquals("Alice", currentStudents.findById(1L).getName());
        assertEquals("Bob", currentStudents.findById(2L).getName());
        assertEquals("Charlie", currentStudents.findById(3L).getName());
    }

    @Test
    void testPreviousStudentsContents() {
        assertNotNull(previousStudents);

        assertEquals("Dana", previousStudents.findById(4L).getName());
        assertEquals("Eve", previousStudents.findById(5L).getName());
    }
}

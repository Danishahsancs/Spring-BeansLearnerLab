package com.example.demo;

import com.example.demo.config.InstructorsConfig;
import com.example.demo.model.Instructors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = InstructorsConfig.class)
public class TestInstructorConfig {

    @Autowired
    private Instructors instructors; // primary

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors usaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors ukInstructors;

    @Test
    void testPrimaryInstructorsContents() {
        assertNotNull(instructors);
        assertEquals("Kris", instructors.findById(300L).getName());
        assertEquals("Paul", instructors.findById(301L).getName());
    }

    @Test
    void testUsaInstructorsContents() {
        assertNotNull(usaInstructors);
        assertEquals("Prof. Smith", usaInstructors.findById(100L).getName());
        assertEquals("Prof. Johnson", usaInstructors.findById(101L).getName());
    }

    @Test
    void testUkInstructorsContents() {
        assertNotNull(ukInstructors);
        assertEquals("Dr. Brown", ukInstructors.findById(200L).getName());
        assertEquals("Dr. Green", ukInstructors.findById(201L).getName());
    }
}

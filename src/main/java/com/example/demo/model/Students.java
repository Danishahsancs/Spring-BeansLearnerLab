package com.example.demo.model;

import java.util.Iterator;

public class Students extends People<Student> {
    public Students(Student... students) {
        super(students);
    }

    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}

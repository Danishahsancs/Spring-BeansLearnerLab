package com.example.demo.model;

import java.util.Iterator;

public class Instructors extends People<Instructor> {
    public Instructors(Instructor... instructors) {
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}

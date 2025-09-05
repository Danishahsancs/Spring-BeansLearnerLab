package com.example.demo.model;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
    // First pass: count learners
    int count = 0;
    for (Learner learner : learners) {
        count++;
    }
    
    double numberOfHoursPerPerson = numberOfHours / count;
    
    // Second pass: teach each learner
    for (Learner learner : learners) {
        learner.learn(numberOfHoursPerPerson);
    }
}
}

package main.java.com.example.demo.model;

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
        double numberOfHoursPerPerson = numberOfHours / learners.length;

        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerPerson);
        }
    }
}

package main.java.com.example.demo.model;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long id, String name){
        super(id, name);
        totalStudyTime = 0.0;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours){
        totalStudyTime+=numberOfHours;
    }
}

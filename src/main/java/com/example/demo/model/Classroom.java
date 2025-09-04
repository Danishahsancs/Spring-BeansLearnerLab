package main.java.com.example.demo.model;

public class Classroom {
    
    private Students students;
    private Instructors instructors;

    public Classroom(Students students, Instructors instructors){
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}

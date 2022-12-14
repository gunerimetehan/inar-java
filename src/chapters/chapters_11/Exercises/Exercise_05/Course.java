package chapters.chapters_11.Exercises.Exercise_05;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.numberOfStudents = 0;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }

    public void dropStudents(String student){
        if (students.contains(student)){
            students.remove(student);
            numberOfStudents--;
        }else {
            System.out.println("There isn't any student like \"" + student + "\"");
        }
    }
}

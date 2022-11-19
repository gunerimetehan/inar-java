package chapters.chapters_11.Exercises.Exercise_05;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {
    Course course = new Course("System Dynamics");

        course.addStudent("Metehan");
        course.addStudent("Haluk");
        course.addStudent("Serhat");
        course.addStudent("Hamza");
        course.addStudent("Murat");


    String[] students = course.getStudents();
        System.out.println("After adding ;");
        for (int i = 0; i < students.length; i++) {
        System.out.println(students[i]);
    }
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("------------------");

        course.dropStudents("Metehan");


    students = course.getStudents();
        System.out.println("After dropping;");
        for (int i = 0; i < students.length; i++) {
        System.out.println(students[i]);
    }
        System.out.println("Number of students: " + course.getNumberOfStudents());


}
}

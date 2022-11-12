package chapters.chapters_10.Exercises.Exercise_09;

import chapters.chapters_10.Listings.Course;

public class TestCourse {
    public static void main(String[] args) {
        chapters.chapters_10.Listings.Course course1=new chapters.chapters_10.Listings.Course("Data Structures");
        chapters.chapters_10.Listings.Course course2=new Course("Database Systems");

        course1.addStudent("Metehan Guneri");
        course1.addStudent("Huzeyfe Balci");
        course1.addStudent("Fatih Yilmaz");

        course2.addStudent("Metehan Guneri");
        course2.addStudent("Ozan Kizilkaya");


        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students= course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) { //I think no need to display the null values
            System.out.print(students[i]+ " ");
        }
        System.out.println();
        System.out.print("Number of students in course2: " +course2.getNumberOfStudents());

        System.out.println();
        course2.dropStudent("Ozan Kizilkaya");
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        String[] students2= course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students2[i]+ " ");
        }
    }
}

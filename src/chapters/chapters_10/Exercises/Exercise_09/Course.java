package chapters.chapters_10.Exercises.Exercise_09;

public class Course {
    //Datafields
    private String courseName;
    private String[] students= new String[100];
    private int numberOfStudents;

    //Constructor
    public Course(String courseName){
        this.courseName=courseName;
    }
    //Method
    public void addStudent(String student){
        if (numberOfStudents >= students.length) {   //if the size exceeds
            String[] tempStudent = new String[students.length * 2];
            System.arraycopy(students, 0, tempStudent, 0, students.length);
            students = tempStudent;
        }
        students[numberOfStudents]=student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i]==student){
                students[i]= students[numberOfStudents-1];
                students[numberOfStudents-1]=null;
                numberOfStudents--;
            }
        }
    }

}

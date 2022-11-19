package chapters.chapters_11.Exercises.Exercise_02;

public class Student extends Person{
    public  final int FRESHMAN = 0; //statues as constants -- static??
    public  final int SOPHOMORE = 1;
    public  final int JUNIOR = 2;
    public  final int SENIOR = 3;

    private int classStatus;

    public Student(String name, String address, String phoneNumber, String email,
                   int classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus=classStatus;
    }
    public int getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString(){
        return "Class = Student\nName = " + getName() + "\n";
    }
}

package chapters.chapters_11.Exercises.Exercise_02;

import chapters.chapters_10.Exercises.Exercise_14.MyDate;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate hiredDate,String title) {
        super(name, address, phoneNumber, email, office, salary, hiredDate);
        this.title=title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Class = Staff\nName = " + getName() + "\n";
    }
}

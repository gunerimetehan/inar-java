package chapters.chapters_11.Exercises.Exercise_02;

import chapters.chapters_10.Exercises.Exercise_14.MyDate;

public class Exercise_02 {
    public static void main(String[] args) {
        Person someone=new Person("Kaan","Adana","+90 534 322 122","smo@email.com");
        Student somebody=new Student("Tahsin","İstanbul","0212 321 23 21",
                "tahsin@email.com",1);
        Employee fellow=new Employee("Mete","earthman","02130213021","asd@gmail.com",
                "EF 308",10000,new MyDate());

        System.out.println(someone);
        System.out.println(somebody);
        System.out.println(fellow);
    }
}

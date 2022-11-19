package chapters.chapters_10.Exercises.Exercise_14;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1=new MyDate();
        MyDate date2=new MyDate(34555553101L);

        System.out.println("date1:" +date1.getYear() +":" +date1.getMonth()+":"+date1.getDay());
        System.out.println("date2:" +date2.getYear() +":" +date2.getMonth()+":"+date2.getDay());
    }
}

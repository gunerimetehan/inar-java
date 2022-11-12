package chapters.chapters_10.Exercises.Exercise_01;

public class TestTime {
    public static void main(String[] args) {
        Time time=new Time();
        Time time1=new Time(555550000);

        System.out.println(time.getHour() +":" + time.getMinute()+":"+time.getSecond());
        System.out.println(time1.getHour()+":" + time1.getMinute()+":"+ time1.getSecond());

    }
}

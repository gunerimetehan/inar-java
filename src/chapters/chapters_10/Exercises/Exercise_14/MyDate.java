package chapters.chapters_10.Exercises.Exercise_14;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;


    public MyDate(){
    this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime){
    this(calendar(elapsedTime).get(GregorianCalendar.YEAR),calendar(elapsedTime).get(GregorianCalendar.MONTH),
            calendar(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH));
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static GregorianCalendar calendar(long elapsedTime){
        GregorianCalendar g=new GregorianCalendar();
        g.setTimeInMillis(elapsedTime);
        return g;
    }
    public void setDate(long elapsedTime){
        GregorianCalendar c = calendar(elapsedTime);
        year=c.get(GregorianCalendar.YEAR);
        month=c.get(GregorianCalendar.MONTH);
        day=c.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

}

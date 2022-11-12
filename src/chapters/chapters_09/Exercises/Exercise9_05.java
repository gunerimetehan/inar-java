package chapters.chapters_09.Exercises;

import java.util.GregorianCalendar;

public class Exercise9_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar=new GregorianCalendar();
        System.out.println("The current date is " + calendar.get(GregorianCalendar.YEAR) +"." +calendar.get(GregorianCalendar.MONTH)
        +"." +calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("After the elapsed time, the date is " + calendar.get(GregorianCalendar.YEAR) +"." +calendar.get(GregorianCalendar.MONTH)
                +"." +calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

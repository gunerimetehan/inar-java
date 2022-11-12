package chapters.chapters_09.Exercises;
import java.util.Date;
import java.util.Date;

public class Exercise9_03 {
    public static void main(String[] args) {
        //java.util.Date date=new Date();  /**Multiple choices of creating a date object */
        //java.util.Date date= new java.util.Date();
        Date date = new Date();
       // date.setTime(10000);
        System.out.println("the sampled time is" +date.toString() );//

        System.out.printf("%-15s%15s\n","Elapsed Time", "Date");
        for (int i = 0; i < 8; i++) {
            date.setTime((long) Math.pow(10,i+4.0));
            System.out.printf("%-15d%15s",(long)Math.pow(10,i+4.0),date.toString() +"\n");
        }

    }
}

package chapters.chapters_06_Exercises;

public class Exercise6_25 {
    public static void main(String[] args) {
        final long milliSeconds = 555550000;
        System.out.println(convertMillis(milliSeconds));
    }
    public static String convertMillis(long a){
        String time="";
        long totalSeconds = a / 1000;
        time = ":" +totalSeconds;
        long totalMinutes = totalSeconds / 60;
        time= ":" +totalMinutes +time;
        long totalHours = totalMinutes / 60;
        time = totalHours +time;

        return time;

    }
}

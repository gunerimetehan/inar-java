package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_11 {
    public static void main(String[] args) {
        double[] numbers=Exercise7_9.getAnArrayFromUser();
       double mean = mean(numbers);
        double deviation = deviation(numbers);
        System.out.println("Mean is " +mean);
        System.out.println("Sd is " + deviation);
    }
    public static double mean(double[] numbers){
        double mean;
        double sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        mean = sum/ numbers.length;
        return mean;
    }
    public static double deviation(double[] numbers){
        double mean=mean(numbers);
        double sum=0;
        double deviation;
        for (int i = 0; i < numbers.length; i++) {
            sum+= Math.pow(numbers[i]-mean,2);
        }
        deviation=Math.sqrt(sum / (numbers.length-1));
        return deviation;
    }
}

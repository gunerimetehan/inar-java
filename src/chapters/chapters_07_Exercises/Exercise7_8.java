package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double[] numbers=new double[10];
        System.out.print("Enter 10 double values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextDouble();
        }
       double average = average(numbers);
        System.out.println("Average is " +average);

        }
        public static int average(int[] array){
        int sum=0;
        int average;
            for (int i = 0; i < array.length; i++) {
                sum+=array[i];
            }
            average = sum/array.length;
            return average;
        }
        public static double average(double[] array){
            double sum=0;
            double average;
            for (int i = 0; i < array.length; i++) {
                sum+=array[i];
            }
            average = sum/array.length;
            return average;

        }
    }


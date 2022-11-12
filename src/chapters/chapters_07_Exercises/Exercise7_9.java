package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_9 {
    public static void main(String[] args) {
        double[] numbers=getAnArrayFromUser();
        double minNumber =findMinFromArray(numbers);
        System.out.println(minNumber);
    }
    public static double[] getAnArrayFromUser(){
        Scanner input = new Scanner(System.in);
        double[] numbers=new double[10];
        System.out.print("Enter 10 numbers ");
        for (int i=0;i< numbers.length;i++){
            numbers[i]=input.nextDouble();
        }
        return numbers;
    }
    public static double findMinFromArray(double[] numbers){
        double number= Double.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<number){
                number = numbers[i];
            }
        }
        return number;
    }
}

package chapters.chapters_07_Exercises;
import java.util.Scanner;

//0 1 2 3 4 -->invalid
//10 15 20 25 30 -->5
// with negative numbers??

public class Exercise7_14 {
    public static void main(String[] args) {
        int[] numbers=getAnArrayWithFiveNumbersFromUser();
       
        int gcd = gcd(numbers);
        System.out.println(gcd);
    }

    private static int gcd(int... numbers) {
        int min =findMinimumIntegerFromArray(numbers);
        int divisor=2;
        int gcd =1; //Smallest gcd, if the numbers are relatively prime 1 will be displayed
        boolean divisorForEveryNumber;

        while(divisor<=min){
            divisorForEveryNumber=true; //Loop must start with true at every iteration;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % divisor !=0){
                    divisorForEveryNumber =false;
                    break;
                }
            }
            if (divisorForEveryNumber){
                gcd=divisor;
            }
            divisor++;

        }
        return gcd;
    }
    public static int findMinimumIntegerFromArray(int[] numbers){
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<minNumber){
                minNumber=numbers[i];
            }
        }
        return minNumber;
    }

    public static int[] getAnArrayWithFiveNumbersFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers");
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                System.out.println("Invalid input");
                System.exit(1);
            }
        }

        return array;
    }
}

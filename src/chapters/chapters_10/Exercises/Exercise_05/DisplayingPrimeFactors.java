package chapters.chapters_10.Exercises.Exercise_05;
import chapters.chapters_10.Listings.StackOfIntegers;

import java.util.Scanner;
public class DisplayingPrimeFactors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number=input.nextInt();

        StackOfIntegers integers=new StackOfIntegers();
        for (int i = 2; i <= number; i++) {
            while (number%i==0){
                integers.push(i);
                number/=i;
            }
        } while (!integers.empty()){
            System.out.print(integers.pop() +" ");
        }
    }
}

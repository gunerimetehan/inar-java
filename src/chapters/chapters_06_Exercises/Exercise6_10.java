package chapters.chapters_06_Exercises;

import chapters.chapters_06.Listing6_7_PrimeNumbers;

public class Exercise6_10 {
    public static void main(String[] args) {
       final int upToTheNumber =10000;
        System.out.println("There are " +count(upToTheNumber) + " prime numbers less than " +upToTheNumber);
    }
    public static int count(int a){
        int count=0;
        for(int i=1;i<=10000;i++){
            if (Listing6_7_PrimeNumbers.isPrime(i)){
                count++;
            }
        }
        return count;
    }

}

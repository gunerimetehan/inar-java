package chapters.chapters_10.Exercises.Exercise_06;

import chapters.chapters_10.Listings.StackOfIntegers;

public class DisplayingPrimeNumbers {
    public static void main(String[] args) {

        StackOfIntegers integers = findThePrimesLessThen120();
        display(integers);

    }

    public static StackOfIntegers findThePrimesLessThen120() {
        StackOfIntegers integers = new StackOfIntegers();
        integers.push(2);
        for (int i = 3; i < 120; i++) {
            if (isPrime(i)) {
                integers.push(i);
            }
        }
        return integers;
    }
        public static boolean isPrime(int number){
            for (int i = 2; i <number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static void display(StackOfIntegers integers) {
        System.out.println("First 120 prime numbers are:");
        while (!integers.empty()) {
            System.out.print(integers.pop() + " ");
        }
    }
}
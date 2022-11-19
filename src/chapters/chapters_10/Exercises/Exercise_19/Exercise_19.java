package chapters.chapters_10.Exercises.Exercise_19;

import chapters.chapters_10.Exercises.Exercise_18.Exercise_18;

import java.math.BigInteger;

public class Exercise_19 {
    public static void main(String[] args) {
        displayMersennePrimes(100);
    }
    public static void displayMersennePrimes(int a){
        BigInteger mersennePrime;
        for (int i = 0; i < a; i++) {
            if (isPrime(i)){
            mersennePrime=BigInteger.ONE;
            for (int j = 0; j < i; j++) {
                mersennePrime=mersennePrime.multiply(new BigInteger("2")); //2^p
            }
            mersennePrime=mersennePrime.subtract(new BigInteger("1")); //2^p-1
            if (Exercise_18.isPrime(mersennePrime)){
                System.out.printf("%-4d %20d\n",i,mersennePrime);
            }
        }
    }
    }
    public static boolean isPrime(int p) {
        if (p == 0 || p == 1 ) {
            return false;
        }
        if (p == 2) {
            return true;
        }

        for (int i = 3; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
    }

package chapters.chapters_10.Exercises.Exercise_18;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        displayLargePrimeNumbers(5);
    }
    public static void displayLargePrimeNumbers(int a){
        BigInteger integer=new BigInteger(Long.MAX_VALUE+"").add(BigInteger.ONE);
        int count=0;
        while (count<a){
            if (isPrime(integer)){
                System.out.println(integer);
                count++;
            }
            integer=integer.add(BigInteger.ONE);
        }
    }
    public static boolean isPrime(BigInteger a){
        if(a.equals(BigInteger.ONE) || a.equals(BigInteger.ZERO))
            return false;

        if (a.equals(new BigInteger(2 + "")))
            return true;

        BigInteger b=new BigInteger("3");
        while (b.compareTo(a.divide(new BigInteger("2")))<=0) {
            if (a.remainder(b).equals(BigInteger.ZERO)) {
                return false;
            }
            b = b.add(BigInteger.ONE);
        }
        return true;
    }
}

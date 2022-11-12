package chapters.chapters_10.Listings;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is\n" + factorial(50));
    }
    public static BigInteger factorial(long number){
        BigInteger result=BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result=result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}

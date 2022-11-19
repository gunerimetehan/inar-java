package chapters.chapters_10.Exercises.Exercise_17;

import java.math.BigInteger;

public class Exercise_17 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE +"\n");

        squareNumbersGreaterThatLongMaxValue(10);

    }
    public static void squareNumbersGreaterThatLongMaxValue(int a){
        /**
         *  If we calculate the square root of the long max value,
         *  by adding 1 to it we can find to square numbers bigger than long max value
         */
        long b= (long) Math.sqrt(Long.MAX_VALUE)+1;
        BigInteger integer=new BigInteger(b+"");
        for (int i = 0; i < a; i++) {
            System.out.println(integer.multiply(integer)); //Math.pow kullanılamaz
            integer=integer.add(BigInteger.ONE);
        }
    }
}

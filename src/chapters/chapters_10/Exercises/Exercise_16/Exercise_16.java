package chapters.chapters_10.Exercises.Exercise_16;
import java.math.BigInteger;
public class Exercise_16 {
    public static void main(String[] args) {
        BigInteger integer=new BigInteger("10000000000000000000000000000000000000000000000000");
        int count=0;
        while (count<10){
            //Required type Bıg integer olduğu için remainder(2) şeklinde yazamadık.
            if (integer.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
            integer.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(integer);
                count++;
            }
            integer=integer.add(BigInteger.ONE);
        }
    }
}

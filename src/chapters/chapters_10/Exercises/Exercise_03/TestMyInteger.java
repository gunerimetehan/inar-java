package chapters.chapters_10.Exercises.Exercise_03;

public class TestMyInteger {
    public static void main(String[] args) {

        MyInteger number = new MyInteger(10);
        System.out.println("The number is "+number.getValue() +"\nis even:" +number.isEven() +" is odd: " +number.isOdd()
        + " is prime:" + number.isPrime());
        System.out.println(number.equals(new MyInteger(20)));
        System.out.println(number.isPrime(new MyInteger(123)));
    }
}
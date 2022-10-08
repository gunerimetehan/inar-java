package chapters.chapters_06_Exercises;

public class Exercise6_26 {
    public static void main(String[] args) {
        final int numbersPerLine = 10;
        int count = 0;
        int number = 10;
        while (count <= 100) {
            if (isPalindromeAndPrime(number)) {
                count++;
                if (count % numbersPerLine == 0) {
                    System.out.println(number);
                } else {
                    System.out.printf("%-8d", number);
                }
            }
            number++;
        }
    }
    public static boolean isPalindromeAndPrime(int number) {
            int reverseOfNumber = reverse(number);
            if (number == reverseOfNumber && isPrime(number)) {
                return true;

            } else
                return false;

    }
    public static int reverse(int number){
        String s="";
        while(number!=0){
            s+=number%10;
            number/=10;
        }
        return Integer.parseInt(s);
    }
    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        for (int d = 2; d <= number / 2; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }
    }


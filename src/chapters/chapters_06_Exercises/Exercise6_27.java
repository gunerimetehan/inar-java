package chapters.chapters_06_Exercises;

public class Exercise6_27 {
    public static void main(String[] args) {
        final int numbersPerLine = 10;
        int count = 0;
        int number = 10;
        while (count < 100) {
            if(isEmirp(number)){
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
    public static boolean isEmirp(int a){
        if (Exercise6_26.isPrime(a) && reverseIsPrime(a)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean reverseIsPrime(int b){
        String s="";
        while(b!=0){
            s+=b%10;
            b/=10;
        }
       return Exercise6_26.isPrime(Integer.parseInt(s));

    }

    }


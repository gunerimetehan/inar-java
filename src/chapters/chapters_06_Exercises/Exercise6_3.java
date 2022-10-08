package chapters.chapters_06_Exercises;

public class Exercise6_3 {
    public static void main(String[] args) {
            //Palindrome-->1221-1101
        final int number =1101;
        System.out.println(number + " is palindrome " +isPalindrome(number));
    }
    public static boolean isPalindrome(int number){
        int reverseOfNumber = reverse(number);
        if(number ==reverseOfNumber) {
            return true;
        }
        else
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
}

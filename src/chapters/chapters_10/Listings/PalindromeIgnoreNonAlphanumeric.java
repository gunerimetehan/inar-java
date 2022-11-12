package chapters.chapters_10.Listings;
import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \n is " +s + " a palinrome? " +isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        String s1=filter(s); // Create a new string by eliminating the nonalphanumeric chars

        //Create a new string that is the reversal of the s1
        String s2=reverse(s1);

        //Check if the reversal is the same with the original
        return s1.equals(s2);
    }
    public static String filter(String s){
        //Create a string builder
        StringBuilder stringBuilder=new StringBuilder();
        //Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        //Return a new filtered string
        return stringBuilder.toString();
    }
    public static String reverse(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse(); //Invoke reverse in stringbuilder
        return stringBuilder.toString();
    }
}

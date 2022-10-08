package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string");
        String s=input.nextLine();
        System.out.println("There are " +countLetters(s) + " letters in this string ");
    }
    public static int countLetters(String a){
        int count=0;
        for (int i=0;i<a.length();i++){
            if(Character.isLetter(a.charAt(i))){
                count++;
            }
        }
        return count;
    }

}

package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a string and followed by a character");
        String s=input.next();
        String character=input.next();
        char ch = character.charAt(0);
        System.out.println(s +" has " +count(s,ch) +"" + ch);
    }
    public static int count(String a,char b){
        int count=0;
        for (int i=0;i<a.length();i++){
            if (b==a.charAt(i)){
                count++;
            }
        }
        return count;
    }
}

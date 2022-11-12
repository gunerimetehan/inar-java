package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_34 {
    //turn the string into a char array
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string ");
        String s =input.nextLine();
        String sSorted =sort(s);
        System.out.println(s);
        System.out.println(sSorted);
    }
    public static String sort(String s){
        char[] charArray=s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i+1; j < charArray.length; j++) {
                if (charArray[i]>charArray[j]){
                    char temp=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        String sorted="";
        for (int i = 0; i < charArray.length; i++) {
            sorted+=charArray[i];
        }
        return sorted;
    }
}

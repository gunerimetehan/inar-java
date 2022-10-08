package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number=input.nextInt();
        reverse(number);
    }

    public static void reverse(int a){
        String s="";
        while(a!=0){
            s+=a%10;
            a/=10;
        }
        System.out.println("The reverse of the " +a + " is " + s);

    }

}

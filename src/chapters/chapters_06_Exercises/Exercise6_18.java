package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //12345678- 1asdertf-12aaaaaa-12aaaaaaaaa-MetehanGuneri
        System.out.print("Enter password");
        String password=input.nextLine();
        passwordStatus(password);
    }
    public static void passwordStatus(String s){
        if (isValid(s)){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid password");
        }
    }
    public static boolean isValid(String s){
        int count=0;
        if (s.length()>=8){
            for (int i=0;i<s.length();i++){
                if (Character.isLetterOrDigit(s.charAt(i))){
                    if (Character.isDigit(s.charAt(i))){
                        count++;
                    }
                }

            }
        }
        if(count>=2){
            return true;
        }
        else {
            return false;
        }
    }
}

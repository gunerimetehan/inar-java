package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a phone number");
        String phoneNumber=input.nextLine();

        for (int i=0;i<phoneNumber.length();i++){
            if (Character.isDigit(phoneNumber.charAt(i))){
                System.out.print(phoneNumber.charAt(i));
            }
            if (Character.isLetter(phoneNumber.charAt(i))){
                System.out.print(getNumber(phoneNumber.charAt(i)));

            }
        }

    }
    public static int getNumber(char a){
        if (Character.toUpperCase(a) >= 'W')
            return 9;
        else if (Character.toUpperCase(a) >= 'T')
            return 8;
        else if (Character.toUpperCase(a) >= 'P')
            return 7;
        else if (Character.toUpperCase(a) >= 'M')
            return 6;
        else if (Character.toUpperCase(a) >= 'J')
            return 5;
        else if (Character.toUpperCase(a) >= 'G')
            return 4;
        else if (Character.toUpperCase(a) >= 'D')
            return 3;
        else
            return 2;
    }
}

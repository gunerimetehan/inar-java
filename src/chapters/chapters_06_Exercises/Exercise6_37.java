package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and a width: ");
        int n = input.nextInt();
        int width = input.nextInt();

        System.out.println(format(n, width));
    }
    public static String format(int number, int width){
        String s = number + "";

        for(int i = s.length(); i < width; i++){
            s = "0" + s;
        }

        return s;
    }
}

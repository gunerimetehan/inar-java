package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the polygon is " + area(side));
    }

    public static double area(double s){
        double area = (Math.round((5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5)) * 100) / 100.0);

        return area;
    }
}

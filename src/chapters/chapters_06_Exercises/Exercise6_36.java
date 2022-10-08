package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        System.out.println("The area of the polygon is " + area(n, s));
    }

    public static double area(int n, double s) {
        double area = (Math.round((n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n)) * 100) / 100.0);

        return area;
    }
}

package chapters.chapters_12.Listings;

import java.util.Scanner;

public class QuotientWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            int result = QuotientWithMethod.quotient(n1, n2);
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("Exception: an integer cannot be divided by 0");
        } finally {
            System.out.println("Execution continues...");

        }
    }
}
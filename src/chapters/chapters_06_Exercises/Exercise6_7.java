package chapters.chapters_06_Exercises;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class Exercise6_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter investment amount, annual interest rate in percentage and number of years in order: ");
        double InvestmentAmount = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        int numberOfYears = input.nextInt();

        System.out.printf("%-8s %8s", "Years", "FutureValue\n");
        for (int i = 1; i <= numberOfYears; i++) {
            System.out.printf("%-8s %8.2f\n", i, futureInvesmentValue(InvestmentAmount, annualInterestRate, i));
        }

    }

    public static double futureInvesmentValue(double x, double y, int z) {
            return x * Math.pow(1 + y / 1200, z * 12);

    }
}
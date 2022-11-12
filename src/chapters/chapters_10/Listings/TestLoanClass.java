package chapters.chapters_10.Listings;
import java.util.Scanner;
public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the annual interest rate: ");
        double interestRate=input.nextDouble();
        System.out.print("Enter the number of years:");
        int numberOfYears=input.nextInt();
        System.out.print("Enter the loan amount: ");
        double loanAmount=input.nextDouble();

        //Create a loan object
        Loan newLoan = new Loan(interestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f",
                newLoan.getLoanDate(),newLoan.getMonthlyPayment(),newLoan.getTotalPayment());
    }
}

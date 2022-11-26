package chapters.chapters_12.Exercises.Exercise_04;

import chapters.chapters_10.Listings.Loan;

import java.util.Scanner;

public class TestLoanWithException {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the annual interest rate: ");
        double interestRate=input.nextDouble();
        System.out.print("Enter the number of years:");
        int numberOfYears=input.nextInt();
        System.out.print("Enter the loan amount: ");
        double loanAmount=input.nextDouble();

        //Create a loan object
       LoanWithException newLoan = new LoanWithException(interestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f",
                newLoan.getLoanDate(),newLoan.getMonthlyPayment(),newLoan.getTotalPayment());

        //newLoan.setLoanAmount(-1000);
    }
}

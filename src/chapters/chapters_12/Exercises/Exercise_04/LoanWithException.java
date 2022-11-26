package chapters.chapters_12.Exercises.Exercise_04;

import java.util.Date;

public class LoanWithException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public LoanWithException(){
        this(2.5,1,1000);
    }
    LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount){
        if (annualInterestRate<=0 || numberOfYears<=0 ||loanAmount<=0){
            throw new IllegalArgumentException("Please enter valid inputs \nThis line from loan constructor");
        }
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        loanDate=new java.util.Date();
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        double monthlyPayment=loanAmount*monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment=getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate<=0){
            throw new IllegalArgumentException("Annual Interest rate can not be equal or less than 0");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears<=0){
            throw new IllegalArgumentException("Number of years can not be equal or less than 0");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount<=0){
            throw new IllegalArgumentException("Loan amount can not be equal or less than 0");
        }
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}

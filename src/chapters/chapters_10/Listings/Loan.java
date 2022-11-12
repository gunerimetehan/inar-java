package chapters.chapters_10.Listings;

import java.util.Date;

public class Loan {
    //Datafields
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    Loan(){
    this(2.5,1,1000);
    }
    Loan(double annualInterestRate,int numberOfYears,double loanAmount){
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
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
package chapters.chapters_11.Exercises.Exercise_03;

import chapters.chapters_09.Exercises.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(){
    super(0000-0000-0000,000000000);
    }
    public SavingsAccount(int id,double balance){
        super(id,balance);
    }
    public String toString() {
        return "ClassName = SavingsAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}

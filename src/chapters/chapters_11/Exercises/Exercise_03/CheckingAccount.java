package chapters.chapters_11.Exercises.Exercise_03;

import chapters.chapters_09.Exercises.Account;

public class CheckingAccount extends Account {
    private double overDraftLimit;

    public CheckingAccount(){
        super(0000-0000-0000,0.0);
        overDraftLimit=1000;
    }
    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0 && amount>overDraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Out of draft limits!");
        }
    }
    @Override
    public String toString() {
        return "ClassName = CheckingAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}

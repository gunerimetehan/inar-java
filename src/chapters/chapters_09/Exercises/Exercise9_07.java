package chapters.chapters_09.Exercises;

public class Exercise9_07 {
    public static void main(String[] args) {
        Account newAccount = new Account(1122,20_000);
        newAccount.setAnnualInterestRate(4.5);
        newAccount.withdraw(2500);
        newAccount.deposit(3000);

        System.out.println("The balance is" +newAccount.getBalance() + "the monthly interest is " +newAccount.getMonthlyInterest()
        + " and the date of creation is " +newAccount.getDateCreated());
    }
}

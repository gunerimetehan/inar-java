package chapters.chapters_11.Exercises.Exercise_03;

public class Exercise_03 {
    public static void main(String[] args) {
        Account account = new Account(231,12000);
        CheckingAccount checkingAccount = new CheckingAccount(12345,10000,500);
        SavingsAccount savingsAccount = new SavingsAccount(6789,20000);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}

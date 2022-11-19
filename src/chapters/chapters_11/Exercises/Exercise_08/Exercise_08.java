package chapters.chapters_11.Exercises.Exercise_08;

public class Exercise_08 {
    public static void main(String[] args) {
        NewAccount myAccount=new NewAccount("Mete",1111,100_000);
        myAccount.setAnnualInterestRate(2.0);
        myAccount.deposit(100);
        myAccount.deposit(40);
        myAccount.deposit(50);

        myAccount.withdraw(5);
        myAccount.withdraw(4);
        myAccount.withdraw(2);

        System.out.println(myAccount);

    }
}

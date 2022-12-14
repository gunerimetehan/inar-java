package chapters.chapters_10.Exercises.Exercise_07;
import chapters.chapters_09.Exercises.Account;
import java.util.Scanner;
public class ATMMachine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Account[] accounts=getAccounts(10);

        ATM(accounts,input);
    }
    public static void ATM(Account[] accounts,Scanner input){
        int choice = 0;

        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            while (true) {
                displayMenu();
                System.out.print("Enter a choice: ");
                choice = input.nextInt();
                if (choice == 1) {
                    displayBalance(accounts[id]);
                    System.out.println();
                } else if (choice == 2) {
                    accounts[id].withdraw(enterWithdrawAmount(accounts[id], input));
                    System.out.println();
                } else if (choice == 3) {
                    accounts[id].deposit(enterDepositAmount(input));
                    System.out.println();
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid choice!!");
                }
            }

            System.out.println("Do you want to check another account Y / N :");
            char c = input.next().toUpperCase().charAt(0);
            if (c == 'N') {
                break;
            }
        }
    }

    public static double enterDepositAmount(Scanner input) {
        System.out.print("Enter the amount to deposit: $");
        double deposit = input.nextDouble();
        return deposit;
    }

    public static double enterWithdrawAmount(Account account, Scanner input) {
        while (true) {
            System.out.print("Enter the amount to withdraw: $");
            double withdraw = input.nextDouble();
            if (withdraw <= account.getBalance())
                return withdraw;

            System.out.println();
            System.out.println("You don't have that much money.");
            System.out.println("Your maximum withdraw amount can be $" + account.getBalance());
            System.out.println();
        }
    }

    public static void displayBalance(Account account) {
        System.out.println("The balance is $" + account.getBalance());
    }

    public static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
    public static Account[] getAccounts(int a){
        Account[] accounts=new Account[a];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i]=new Account(i,100);
        }
        return accounts;
    }
}

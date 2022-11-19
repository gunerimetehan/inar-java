package chapters.chapters_11.Exercises.Exercise_03;

import java.util.Date;

public class Account {
        //Datafield
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;

        //no-arg Constructor
        public Account() {
            this(0, 0);
            dateCreated = new Date();
        }

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
        }

        //Methods
        public double getMonthlyInterestRate() {
            return getAnnualInterestRate() / 100 / 12;
        }

        public double getMonthlyInterest() {
            return getMonthlyInterestRate() * getBalance();
        }

        public void withdraw(double withdrawAmount) {
            setBalance(getBalance() - withdrawAmount);
        }

        public void deposit(double depositAmount) {
            setBalance(getBalance() + depositAmount);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        @Override
        public String toString() {
            return "ClassName = Account\nBalance = " + getBalance() + "\nMonthly interest = " + getMonthlyInterest() +
                    "\nDate created = " + getDateCreated();
        }
    }

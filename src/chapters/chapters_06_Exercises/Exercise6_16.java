package chapters.chapters_06_Exercises;

import chapters.chapters_06.Listing6_7_PrimeNumbers;

public class Exercise6_16 {
    public static void main(String[] args) {
        System.out.printf("%-8s %8s","year","Number Of Days in the Year");
        for (int i=2000;i<=2020;i++){
            System.out.printf("\n%-8d %8d",i,numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if (( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            return 366;
        }
        else{
            return 365;
        }
    }

}

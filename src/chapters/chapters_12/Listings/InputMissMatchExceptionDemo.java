package chapters.chapters_12.Listings;

import java.util.*;

public class InputMissMatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean continueInput=true;

        do {
            try {
                System.out.println("Enter an integer:");
                int number=input.nextInt();

                System.out.println("The number entered: " +number);
                continueInput=false;
            }catch (InputMismatchException missMatchException){
                System.out.println("Try again.(Incorrect input:an integer required");
                input.nextLine();
            }
            }while (continueInput);
        }
    }


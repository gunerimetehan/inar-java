package chapters.chapters_12.Exercises.Exercise_02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise_02_InputMismatchException {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean continueInput=true;
        do {
            try{
                System.out.println("Enter two integers:");
                int n1=input.nextInt();
                int n2=input.nextInt();

                System.out.println("The sum of 2 numbers = " +(n1+n2));
                continueInput =false;
            }catch (InputMismatchException mismatchException){
                System.out.println("Invalid input! Please try again");
                 input.nextLine();
            }
        }while (continueInput);
    }
}

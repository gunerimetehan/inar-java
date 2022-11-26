package chapters.chapters_12.Exercises.Exercise_06;

import java.util.Scanner;

import static chapters.chapters_12.Exercises.Exercise_06.hexToDec.hexToDecimal;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            try {
                System.out.println("The decimal value for hex number " + hex + " is " +
                        hexToDecimal(hex.toUpperCase()));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter a valid Hex value");

            }
        }
    }
}
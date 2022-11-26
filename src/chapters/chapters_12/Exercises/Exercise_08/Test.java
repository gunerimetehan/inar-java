package chapters.chapters_12.Exercises.Exercise_08;

import java.util.Scanner;

import static chapters.chapters_12.Exercises.Exercise_08.Hex2Dec.hexToDecimal;


public class Test {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            try {
                System.out.println("The decimal value for hex number " + hex + " is " +
                        hexToDecimal(hex.toUpperCase()));
                break;
            } catch (HexFormatException ex) {
                System.out.println("invalid input");
            }
        }
    }
}

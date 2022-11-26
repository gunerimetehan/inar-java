package chapters.chapters_12.Listings;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int n1=input.nextInt();
        int n2=input.nextInt();

        if (n2!=0){
            System.out.println(n1 + "/" + n2 + "=" +(n1/n2));
        }else
            System.out.println("Divisor can not be 0");


    }
}

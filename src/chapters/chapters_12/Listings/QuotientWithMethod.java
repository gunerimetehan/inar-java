package chapters.chapters_12.Listings;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int n1=input.nextInt();
        int n2=input.nextInt();

        int result=quotient(n1,n2);
        System.out.println(result);
    }
    public static int quotient(int n1,int n2){
        if (n2==0){
            System.out.println("Divisor cannot be 0");
            //System.exit(1);
        }
            return n1/n2;
    }
}

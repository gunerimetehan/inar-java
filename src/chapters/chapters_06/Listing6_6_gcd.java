package chapters.chapters_06;
import java.util.Scanner;
public class Listing6_6_gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter two integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("gcd for " + num1 + " and " + num2 + " is " + gcd(num1,num2));
    }
    public static int gcd(int a,int b){
        int gcd =1; //initial gcd
        int k=2;   //first possible divisor

        while (k<=a && k<=b){
            if(a%k==0 && b%k==0){
                gcd =k;
            }
            k++;
        }
        return gcd;
    }
}

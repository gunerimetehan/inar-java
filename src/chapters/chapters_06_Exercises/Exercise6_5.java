package chapters.chapters_06_Exercises;
import java.util.Scanner;
public class Exercise6_5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print(" Enter three integers: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        //12-0-0.1;3-10-2
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double a,double b,double c){
        double temp=0;
        if(a>b){
            temp=a;
            a=b;
            b=temp;

        }
        if (b>c){
            temp=b;
            b=c;
            c=temp;

        }
        if (a>c){
            temp=a;
            a=c;
            c=temp;
        }
        System.out.println(a + " < " + b + " < " + c);
    }
}

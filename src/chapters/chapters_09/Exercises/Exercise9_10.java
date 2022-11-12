package chapters.chapters_09.Exercises;
import java.util.Scanner;
public class Exercise9_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter values a,b,c respectively: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if (equation.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        } else if (equation.getDiscriminant()==0) {
            System.out.println("The equation has one root and the root is " +equation.getRoot1());
        }else{
            System.out.println("The equation has two roots which are " +equation.getRoot1() + " and " +equation.getRoot2());
        }

    }
}

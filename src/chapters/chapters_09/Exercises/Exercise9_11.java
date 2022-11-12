package chapters.chapters_09.Exercises;
import java.util.Scanner;
public class Exercise9_11 {
    public static void main(String[] args) {
        double[] values=getFromUser();
        LinearEquation equation=new LinearEquation(values[0],values[1],values[2],values[3],values[4], values[5] );
        if (equation.isSolvable()){
            System.out.println("X is " +equation.getX() +" and the Y is " + equation.getY());
        }else{
            System.out.println("The equaition has no solution");
        }
    }
    public static double[] getFromUser(){
        Scanner input=new Scanner(System.in);
        double[] valeus=new double[6];
        System.out.print("Enter values for a,b,c,d,e,f respectively: " );
        for (int i = 0; i < valeus.length; i++) {
            valeus[i]=input.nextDouble();
        }
        return valeus;
    }
}

package chapters.chapters_09.Exercises;

import java.util.Scanner;

public class Exercise9_12 {
    public static void main(String[] args) {
        double[][] points = getFromUser();
        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        if (equation.isSolvable()) {
            System.out.println("x: " + equation.getX() + " y: " + equation.getY());
        } else {
            System.out.println("The two lines are parallel");
        }
    }
    public static double[][] getFromUser(){
        double[][] points=new double[4][2];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the X- and Y- coordinates of 4 points respectively: ");
        for (int i = 0; i < points.length ; i++) {
            points[i][0]=input.nextDouble();
            points[i][1]=input.nextDouble();
        }
        return points;
    }
}

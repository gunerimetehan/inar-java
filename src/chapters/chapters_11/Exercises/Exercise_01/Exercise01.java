package chapters.chapters_11.Exercises.Exercise_01;
import java.util.Scanner;
public class Exercise01 {
    public static void main(String[] args) {
      Triangle triangle=  getPropertiesOfTriangle();

        System.out.print("Triangle's Properties\n______________");
        System.out.println("\nArea:" +triangle.getArea() +"\nPerimeter:" +triangle.getPerimeter() +
                "\nColor:" +triangle.getColor() + "\nisFilled: " +triangle.isFilled());

        System.out.println(triangle);
    }
    public static Triangle getPropertiesOfTriangle(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter three sides of triangle, its color and if its filled or not");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        String color=input.next();
        boolean isFilled=input.nextBoolean();

        Triangle triangle=new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        return triangle;

    }
}

package chapters.chapters_06_Exercises;

public class Exercise6_19 {
    public static void main(String[] args) {
   double side1=4,side2=4,side3=2;
    if (isValid(side1,side2,side3)){
        System.out.printf("Area of the triangle with the given input is %2.2f",area(side1,side2,side3));
    }
    else {
        System.out.println("Invalid input");
    }
    }
    public static boolean isValid(double side1,double side2,double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else
            return false;
    }
    public static double area(double a,double b,double c){
        double s = (a + b + c)/2;
        double area = Math.pow(s * (s-a) * (s - b) * (s - c), 0.5);

        return area;
    }
}

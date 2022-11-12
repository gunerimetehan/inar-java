package chapters.chapters_09.Listings;

public class Listing9_1 {
    public static void main(String[] args) {
        Listing9_2_SimpleCircle circle1 = new Listing9_2_SimpleCircle();
        System.out.println("The area of the circle of radius " +circle1.radius + " is " + circle1.getArea());
        //Create circle with radius 25
        Listing9_2_SimpleCircle circle2 = new Listing9_2_SimpleCircle(25);
        System.out.println("The area of the circle of radius " +circle2.radius + " is " + circle2.getArea());
        Listing9_2_SimpleCircle circle3 = new Listing9_2_SimpleCircle(125);
        System.out.println("The area of the circle of radius " +circle3.radius + " is " + circle3.getArea());

        //Modify circle radius
        circle2.radius=100; //circle2.setRadius(100);
        System.out.println("The area of the circle of radius " +circle2.radius + " is " + circle2.getArea());


    }
}
class SimpleCircle{
double radius;

//Construct a circle with a specified radius 1
    SimpleCircle(){
        radius=1;
    }
    SimpleCircle(double newRadius){
        radius=newRadius;
    }
    //return the are of this circle
    double getArea(){
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }

}
package chapters.chapters_09.Listings;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c1=new CircleWithPrivateDataFields(5);
        System.out.println("The area of the circle with radius "  +c1.getRadius() + " is " +c1.getArea() );

        //Increase c1's radius by %10
        c1.setRadius(c1.getRadius()*1.1);
        System.out.println("The area of the circle with radius "  +c1.getRadius() + " is " +c1.getArea() );

        System.out.println("The number of objects created is " +CircleWithPrivateDataFields.getNumberOfObjects());
    }
}

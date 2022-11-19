package chapters.chapters_11.Listings;

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle=new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " +circle.toString());
        System.out.println("The color is " +circle.getColor());
        System.out.println("radius:" +circle.getRadius());
        System.out.println("area:"+circle.getArea());
        System.out.println( "diameter:"+circle.getDiameter());
        CircleFromSimpleGeometricObject newCircle= new CircleFromSimpleGeometricObject(3);
        System.out.println(circle.equals(newCircle));

        RectangleFromSimpleGeometricObject rectangle=new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\nA rectangle " +rectangle.toString());
        System.out.println("area:" +rectangle.getArea());
        System.out.println("perimeter:" +rectangle.getPerimeter());

    }
}

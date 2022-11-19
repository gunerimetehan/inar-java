package chapters.chapters_11.Listings;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
        displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
    }

    public static void displayObject(SimpleGeometricObjects object){
        System.out.println("Created on " +object.getDateCreated() + " and color is " +object.getColor());
    }
}

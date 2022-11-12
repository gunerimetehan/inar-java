package chapters.chapters_09.Listings;

public class CircleWithPrivateDataFields {
    private double radius=1;
    private static int numberOfObjects=0;

    public CircleWithPrivateDataFields(){
        numberOfObjects++;
    }
    public CircleWithPrivateDataFields(double newRadius){
        this.radius=newRadius;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        CircleWithPrivateDataFields.numberOfObjects = numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}

package chapters.chapters_12.Listings;

public class InvalidRadiusException extends Exception{
    private double radius;

    //Constructor
    public InvalidRadiusException(double radius){
        super("Invalid Radius: " +radius);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }

}

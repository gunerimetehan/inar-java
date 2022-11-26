package chapters.chapters_12.Listings;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            CircleWithCustomException c1=new CircleWithCustomException(5);
            CircleWithCustomException c2=new CircleWithCustomException(-5);
            CircleWithCustomException c3=new CircleWithCustomException(0);
        }catch (InvalidRadiusException re){
            System.out.println(re);
        }
        System.out.println("# of objects created: " +CircleWithCustomException.getNumberOfObjects());
    }
}
class CircleWithCustomException{
    private double radius;
    private static int numberOfObjects;

    public CircleWithCustomException() throws InvalidRadiusException{
        this(1.0);
        numberOfObjects++;
    }
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException{
        if (radius>=0)
            this.radius = radius;
        else
            throw new InvalidRadiusException(radius);
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

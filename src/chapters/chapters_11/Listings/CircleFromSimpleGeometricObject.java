package chapters.chapters_11.Listings;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObjects {

    private double radius;

    public CircleFromSimpleGeometricObject(){
    }
    public CircleFromSimpleGeometricObject(double radius){
        this.radius=radius;
    }
    public CircleFromSimpleGeometricObject(double radius,String color,boolean filled){
     super(color, filled);
     this.radius=radius;
     //   this.radius=radius;
     //   setColor(color);
     //   setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle(){
        System.out.println("The circle is created " +super.getDateCreated() + " and the radius is " +radius);
    }
    @Override
    public String toString(){
        return super.toString() +"\n radius: " +radius;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof CircleFromSimpleGeometricObject){
            return radius==((CircleFromSimpleGeometricObject) o).getRadius();
        }else{
            return this==o;
        }
    }
}

package chapters.chapters_09.Exercises;

public class RegularPolygon {
    //Datafields
    private int n;
    private double side;
    private double x;
    private double y;

    //no-arg Constructor
    RegularPolygon(){
        this(3,1,0,0);
    }
    //Constructors
    RegularPolygon(int n, double side){
        this.n=n;
        this.side=side;
    }
    RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    //Methods
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

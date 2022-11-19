package chapters.chapters_10.Exercises.Exercise_12;

import chapters.chapters_10.Exercises.Exercise_04.MyPoint;

import java.security.PublicKey;

public class Triangle2D {
    //Datafields
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    //no-arg constructor
    public Triangle2D(){
     //   this((0,0),(1,0),(2,5));
        this(new MyPoint(0,0),new MyPoint(1,0),new MyPoint(2,5));
    }
    public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    //Methods
    public double getArea(){  //a+b+c/2
        double a= p1.distance(p2);
        double b= p1.distance(p3);
        double c= p2.distance(p3);

        double u=(a+b+c)/2;
        double area= Math.sqrt(u*(u-a)*(u-b)*(u*c));
        return area;
    }
    public double getPerimeter(){
        double a= p1.distance(p2);
        double b= p1.distance(p3);
        double c= p2.distance(p3);

        return a+b+c;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}

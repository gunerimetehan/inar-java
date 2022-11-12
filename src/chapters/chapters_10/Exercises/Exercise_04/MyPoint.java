package chapters.chapters_10.Exercises.Exercise_04;

import chapters.chapters_10.Exercises.Exercise_03.MyInteger;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0,0);
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    //distance=Math.sqrt((x2-x1)^2+(y2-y1)^2)
    public double distance(MyPoint point){
        double pointX=Math.pow(x-point.getX(),2);
        double pointY=Math.pow(y-point.getY(),2);
        return Math.sqrt(pointX+pointY);
    }
    public double distance(double x,double y){
        double pointX=Math.pow(getX()-x,2);
        double pointY=Math.pow(getY()-y,2);
        return Math.sqrt(pointX+pointY);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

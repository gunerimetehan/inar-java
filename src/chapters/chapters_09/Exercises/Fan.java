package chapters.chapters_09.Exercises;

public class Fan {
    //Datafield
    final static int slow=1;
    final static int medium=2;
    final static int fast=3;

    private int speed=slow;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    //no-arg Constructor
    Fan(){
    }
    public String toString(){
        String message="";
        if (isOn()){
            message =" Fan speed is " +getSpeed() + ", the color is " + getColor()
                    + " and the radius is " +getRadius();
        }else {
            message =" Fan is off. The color is " +getColor() + " and the radius is " + getRadius();
        }
        return message;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

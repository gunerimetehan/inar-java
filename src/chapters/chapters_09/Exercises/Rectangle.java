package chapters.chapters_09.Exercises;

public class Rectangle {
    //Datafields
    private double width;
    private double height;

    //no-arg constructor
    Rectangle(){
        height=1;
        width=1;
    }
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
}

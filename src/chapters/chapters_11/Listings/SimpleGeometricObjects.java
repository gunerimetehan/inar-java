package chapters.chapters_11.Listings;

import java.util.Date;

public class SimpleGeometricObjects {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public SimpleGeometricObjects(){
        this("white",false);
        dateCreated=new Date();
    }
    public SimpleGeometricObjects(String color,boolean filled){
        this.color=color;
        this.filled=filled;
        dateCreated=new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
return "created on" +dateCreated + " \ncolor " +color + "\nand filled " + filled ;} //Return a string representation of this object
}

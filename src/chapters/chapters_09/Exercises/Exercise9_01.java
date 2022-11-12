package chapters.chapters_09.Exercises;

public class Exercise9_01 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,40);
        Rectangle r2=new Rectangle(3.5,35.9);

        System.out.println("first rectangular's width is " +r1.getWidth() + ", the height is " + r1.getHeight()
        + ", the perimeter is " +r1.getPerimeter() + "and the area is " + r1.getArea());

        System.out.println("second rectangular's width is " +r2.getWidth() + ", the height is " + r2.getHeight()
                + ", the perimeter is " +r2.getPerimeter() + "and the area is " + r2.getArea());
    }
}

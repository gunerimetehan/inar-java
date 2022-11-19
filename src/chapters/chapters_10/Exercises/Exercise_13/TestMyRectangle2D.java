package chapters.chapters_10.Exercises.Exercise_13;

public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1=new MyRectangle2D(2,2,5.5,4.9);

        System.out.println("Area: " +r1.getArea() + " Perimeter: "+r1.getPerimeter());
        System.out.println("________________________");
        System.out.println("The points (3,3) is inside the rectangle?" +r1.contains(3,3)
        +"\nnew rectangle is inside the r1?" +r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
    }
}

package chapters.chapters_10.Exercises.Exercise_04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1=new MyPoint();
        MyPoint point2=new MyPoint(10,30.5);

        System.out.printf("The distance between two points:%.3f ",point1.distance(point2));
    }
}

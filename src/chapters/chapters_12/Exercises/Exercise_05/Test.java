package chapters.chapters_12.Exercises.Exercise_05;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Triangle t1 = new Triangle(2, 5, 10);
            System.out.println(t1.toString());
        }catch (IllegalTriangleException exception){
            System.out.println("Not suitable sides");
        }
    }
}

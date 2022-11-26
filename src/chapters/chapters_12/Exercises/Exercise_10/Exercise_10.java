package chapters.chapters_12.Exercises.Exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        try {
            int[] a=new int[Integer.MAX_VALUE*3];
            System.out.println(a);
        }catch (OutOfMemoryError error){
            System.out.println("Out of memory");
        }
    }
}

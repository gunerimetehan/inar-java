package chapters.chapters_06_Exercises;

public class Exercise6_17 {
    public static void main(String[] args) {
        final int n=10;
        printMatriks(n);
    }
    public static void printMatriks(int a){
        for (int j=a;j>0;j--) {
            for (int i = 0; i < a; i++) {
                System.out.printf("%2d", (int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}

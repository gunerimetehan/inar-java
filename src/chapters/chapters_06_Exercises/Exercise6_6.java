package chapters.chapters_06_Exercises;

public class Exercise6_6 {
    public static void main(String[] args) {
        final int n =12;
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int i=1;i<=n;i++) {
            for (int j = i; j <n; j++) {
                System.out.printf("%3s", "");
            }
            for (int j=i;j>0;j--){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}

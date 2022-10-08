package chapters.chapters_06_Exercises;

public class Exercise6_13 {
    public static void main(String[] args) {
        final int series=20;
        printTable(series);
    }
    public static void printTable(int a){
        System.out.printf("%2s %8s\n","i","m(i)");
        System.out.print("___________");
        for (int i=1;i<=a;i++){
            System.out.printf("\n%2d %8.4f",i,sumSeries(i));
        }
    }
    public static double sumSeries(int b){
        double sum=0;
        for (int i=1;i<=b;i++){
            sum+=i/(i+1.0);
        }
        return sum;
    }
}

package chapters.chapters_06_Exercises;

public class Exercise6_14 {
    public static void main(String[] args) {
        printTable(901);
    }
    public static void printTable(int a){
        System.out.printf("%-12s %4s\n","i","m(i)");
        System.out.println("_________________________\n");
        for (int i=1;i<=a;i+=100){
            System.out.printf("%-12d %6.4f\n",i,estimationOfPI(i));
        }

    }
    public static double estimationOfPI(int b){
        double sum=0;
        for (int i=1;i<=b;i++){
            sum+=4*(Math.pow(-1,(i+1))/(2*i-1));
        }
        return sum;
    }
}

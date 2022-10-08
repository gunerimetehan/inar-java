package chapters.chapters_06_Exercises;

public class Exercise6_11 {
    public static void main(String[] args) {
        printTable(100000);
    }
    public static void printTable(int a){
        System.out.printf("%-12s %12s\n","Sales Amount","Commission");
        System.out.print("________________________\n");
        for (int i=10000;i<=a;i+=5000){
            System.out.printf("%8d %14.1f\n",i,computeCommission(i));
        }
    }
    public static double computeCommission(double salesAmount){
        double commission=0;
        for (int i=10000;i<=salesAmount;i+=5000){
            commission =5000*0.08+5000*0.10+(i-10000)*0.12;
        }
        return commission;
    }
}

package chapters.chapters_06_Exercises;

public class Exercise6_9 {
    public static void main(String[] args) {
        System.out.printf("%-8s %8s %5c %8s %8s\n", "Feet", "Meters", '|', "Meters", "Feet");
        for (double i = 1.0, j = 20.0; i <= 10.0; i += 1.0, j += 5.0) {
            System.out.printf("%-8.1f %8.3f %5c %6.1f %12.3f\n",i,footToMeter(i),'|',j,meterToFoot(j));
        }
    }
    public static double footToMeter(double a){
        return 0.305*a;
    }
    public static double meterToFoot(double b){
        return 3.279*b;
    }
}

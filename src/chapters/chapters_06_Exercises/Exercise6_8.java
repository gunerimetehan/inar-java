package chapters.chapters_06_Exercises;

public class Exercise6_8 {
    public static void main(String[] args) {
        System.out.printf("%-8s %8s %3c %8s %8s\n","Celsius","Fahrenheit",'|',"Fahrenheit","Celsius");
        for(double i=40.0,j=120.0;i>=31.0;i-=1.0,j-=10.0){
            System.out.printf("%-8.1f %8.1f %5c %8.1f %8.2f\n",i,celsiusToFahrenheit(i),'|',j,fahrenheitToCelcius(j));
        }
    }
    public static double celsiusToFahrenheit(double a){
        return (9.0/5)*a+32;
    }
    public static double fahrenheitToCelcius(double b){
        return (5.0/9)*(b-32);
    }
}

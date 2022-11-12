package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_12 {
    public static void main(String[] args) {
        double[] array = Exercise7_9.getAnArrayFromUser();
        
        reverseArray(array);
        displayArray(array);
    }
    public static void reverseArray(double[] reverse){
        double temp ;
        for (int i=0,j= reverse.length-1;i<j;i++,j--) {
            temp=reverse[i];
            reverse[i]=reverse[j];
            reverse[j]=temp;
        }
    }
    public static void displayArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

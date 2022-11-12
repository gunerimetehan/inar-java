package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print(" Enter 10 integers ");
        for (int i=0;i< numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        System.out.print("The reverse of the input is ");
                getReverse(numbers);
    }
    public static void getReverse(int[] numbers){
            int[] reversed = new int[numbers.length];
        for (int i=0,j=numbers.length-1;i< numbers.length;i++,j--){
            reversed[i]=numbers[j];
            System.out.print( reversed[i] +" ");
        }
    }
}

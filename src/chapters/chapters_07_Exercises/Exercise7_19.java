package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_19 {
    public static void main(String[] args) {
        //5--> 1 3 2 5 4
        int[] array= getAnArrayFromUserFirstElementIsTheLength();
        isSorted(array);
        if (isSorted(array)){
            System.out.println("the list is already sorted");
        }else{
            System.out.println("the list is not sorted");
        }
    }
    public static int[] getAnArrayFromUserFirstElementIsTheLength(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list: ");
        int arraySize= input.nextInt();
        int[] array=new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        return array;
    }
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (!(array[i]<=array[i+1])){
                return false;
            }
        }
        return true;
    }
}

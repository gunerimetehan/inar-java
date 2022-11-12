package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=input.nextInt();

        int[] arr=new int[l];
        fillArrRandomValues(arr,0,100);
        int indexOfMinValue=indexOfSmallestElement(arr);
        printArray(arr);
        if (arr.length>0) {
            System.out.printf("The mşn value is %d, the index of this number is %d\n", arr[indexOfMinValue], indexOfMinValue);
        }
    }
    public static void fillArrRandomValues(int[] arr,int start,int limit){
        for (int i=0;i<arr.length;i++){
            int num= (int) (start + Math.random()*(limit-start));
            arr[i]=num;
        }
    }
    public static int indexOfSmallestElement(int[] array){
        int minIndex=-1;
        int minValue = Integer.MAX_VALUE;

        for (int i=0;i<array.length;i++){
            if (array[i]<=minValue){
                minIndex=i;
                minValue=array[i];
            }
        }
        return minIndex;
    }
    public static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.printf(arr[i] +" ");
        }
    }
}

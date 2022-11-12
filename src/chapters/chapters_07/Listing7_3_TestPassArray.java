package chapters.chapters_07;

import javax.management.remote.rmi._RMIConnection_Stub;

public class Listing7_3_TestPassArray {
    public static void main(String[] args) {
        int[] a={1,2};
        //Swap elements using the swap method
        System.out.println("Before invoking swap ");
        System.out.println("array is { " + a[0] + " ," + a[1]  +" }");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is { " +a[0] + " , " + a[1] + " }");

        //Swap elements using the swapFirstTwoInArray
        System.out.println("\nBefore invoking swapFirstTwoInArray ");
        System.out.println("array is { " + a[0] + " ," + a[1]  +" }");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is { " +a[0] + " , " + a[1] + " }");

    }
    public static void swap(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void swapFirstTwoInArray(int[] array){
        int temp=array[0];
        array[0]=array[1];
        array[1]= temp;
    }
}

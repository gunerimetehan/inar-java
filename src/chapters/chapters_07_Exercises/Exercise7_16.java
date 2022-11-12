package chapters.chapters_07_Exercises;

import chapters.chapters_07.Listing7_6_LinearSearch;
import chapters.chapters_07.Listing7_7_BinarySearch;

public class Exercise7_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        randomlyFillingTheArray(array);
        int key = (int)(Math.random()*Integer.MAX_VALUE);

        estimatedTimeForLinearSearch(array,key);
        estimatedTimeForBinarySearch(array,key);

    }

    private static void estimatedTimeForBinarySearch(int[] array, int key) {
        long startTime = System.currentTimeMillis();
        Listing7_7_BinarySearch.binarySearch(array,key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The binary search lasts for " + executionTime + " milliseconds");

    }

    public static void randomlyFillingTheArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*Integer.MAX_VALUE);
        }
        java.util.Arrays.sort(array);
    }
    public static void estimatedTimeForLinearSearch(int[] array,int key){
        long startTime = System.currentTimeMillis();
        Listing7_6_LinearSearch.linearSearch(array,key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The linear search lasts for " + executionTime + " milliseconds");
    }
}

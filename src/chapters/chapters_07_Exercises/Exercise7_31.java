package chapters.chapters_07_Exercises;

import java.util.Arrays;

/**
 * 4 1 5 10 22
 * 6 1 2 8 9 20 25
 */

public class Exercise7_31 {
    public static void main(String[] args) {
        int[] list1= Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();
        int[] list2=Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();

        int[] mergedList=merge(list1,list2);
        Exercise7_10.printArray(mergedList);

    }
    public static int[] merge(int[] list1, int[] list2){
        int[] mergedList=new int[list1.length+ list2.length];
        for (int i = 0; i < list1.length; i++) {
            mergedList[i]=list1[i];
        }
        for (int i = list1.length,j=0; i < mergedList.length ; i++,j++) {
            mergedList[i]=list2[j];
        }
        Arrays.sort(mergedList);
        return mergedList;
    }

}

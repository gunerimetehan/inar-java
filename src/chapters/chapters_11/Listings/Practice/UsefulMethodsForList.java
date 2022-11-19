package chapters.chapters_11.Listings.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class UsefulMethodsForList {
    public static void main(String[] args) {
        //Creating an arraylist from an array
        String[] array={"red","green","blue"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(array));

        //creating an array from arraylist
        String[] array1=new String[list.size()];
        list.toArray(array1);

        //sorting a list
        Integer[] integers={3,4,95,23,1,23,564,7,9};
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(integers));
        java.util.Collections.sort(list1);
        System.out.println(list1);
        //finding max and min
        System.out.println(java.util.Collections.max(list1));
        System.out.println(java.util.Collections.min(list1));

        //random shuffling
        java.util.Collections.shuffle(list1);
        System.out.println(list1);

    }
}

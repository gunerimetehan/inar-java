package chapters.chapters_11.Exercises.Exercise_11;

import java.util.ArrayList;

public class Exercise_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        final int size=5;
        for (int i = size; i >0; i--) {  //5 4 3 2 1
            list.add(i);
        }
        System.out.println(list);
        System.out.println("After sorting the list;");
        java.util.Collections.sort(list);
        System.out.println(list);
    }
}

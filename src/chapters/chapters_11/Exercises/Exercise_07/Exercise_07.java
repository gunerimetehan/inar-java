package chapters.chapters_11.Exercises.Exercise_07;

import java.util.ArrayList;

public class Exercise_07 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    fillRandomlyList(list);
    printList(list);

    shuffle(list);
    System.out.println("After shuffling");
    printList(list);

}

    public static void shuffle(ArrayList<Integer> list) {
       java.util.Collections.shuffle(list);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void fillRandomlyList(ArrayList<Integer> list) {
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 100));
        }
    }
}

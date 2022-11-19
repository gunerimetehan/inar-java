package chapters.chapters_11.Exercises.Exercise_13;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_13 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();

            Scanner input=new Scanner(System.in);
        System.out.print("Enter 10 integers:");
            final int size=10;
            for (int i = size; i >0; i--) {
                list.add(input.nextInt());
            }
        removeDuplicates(list);
        System.out.println(list);
    }
        public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> removed = new ArrayList<>();
        while (!list.isEmpty()) {
            int n = list.remove(list.size() - 1);
            if (!removed.contains(n)) {
                removed.add(n);
            }
        }
        list.addAll(removed);
    }
}

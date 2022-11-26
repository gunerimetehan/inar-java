package chapters.chapters_12.Exercises.Exercise_21;

import java.io.File;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gnrmt\\Desktop\\kurs cal'sma\\Sorting");


        try {
            System.out.println("Is the file sorted? " + isFileSorted(file));
        } catch (Exception ex) {
            System.out.println("There isn't any file like Sorting");
        }

    }

    private static boolean isFileSorted(File file) throws Exception {

        String s1;
        String s2 = null;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                // s1 will be the greater one
                s1 = input.next();
                if (s2 != null) {
                    if (s2.compareToIgnoreCase(s1) > 0) {
                        return false;
                    }
                }
                // s2 will be the smaller one
                s2 = s1;
            }
            return true;
        }
    }
}

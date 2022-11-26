package chapters.chapters_12.Exercises.Exercise_19;

import java.net.URL;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://yongdanielliang.github.io/");

        String line;
        String[] s;
        int countWords = 0;
        try (
                Scanner input = new Scanner(url.openStream())
        ) {
            while (input.hasNext()) {
                line = input.nextLine() + "\n";
                s = line.split(" ");
                countWords += s.length;
            }
        }
        System.out.println("https://yongdanielliang.github.io/ has " + countWords + " words");
    }
}

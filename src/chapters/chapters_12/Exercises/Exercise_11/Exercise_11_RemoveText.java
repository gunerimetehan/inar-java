package chapters.chapters_12.Exercises.Exercise_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_11_RemoveText {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("Usage:java Exercise_11_RemoveText StringName sourceFile ");
            System.exit(1);
        }
        //Check if source file exists
        File sourceFile = new File(args[2]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[2] + " does not exist ");
            System.exit(2);
        }
        String s = "";
        StringBuilder sb = new StringBuilder();
        try (
                Scanner input = new Scanner(sourceFile);

        ) {
            while (input.hasNext()) {
                s = input.nextLine();
                sb.append(s.replaceAll(args[0], ""));


            }
        }
        try (
                PrintWriter output = new PrintWriter(sourceFile)
        ) {
            output.print(sb);

        }
    }
}
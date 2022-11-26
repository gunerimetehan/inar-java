package chapters.chapters_12.Exercises.Exercise_16;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) throws Exception{
        if (args.length!=3){
            System.out.println("Usage:java Exercise_16 sourceFile oldStr newStr");
            System.exit(1);
        }
        File sourceFile=new File(args[0]);
        if (!sourceFile.exists()){
            System.out.println("Source file " +args[0] + " does not exist ");
            System.exit(2);
        }
        try(
                Scanner input=new Scanner(sourceFile);
                PrintWriter output=new PrintWriter(sourceFile);
        ){
            while(input.hasNext()){
                String s1=input.nextLine();
                 s1=s1.replaceAll(args[1],args[2] );
                output.println(s1);
            }
        }
    }
}

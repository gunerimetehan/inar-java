package chapters.chapters_12.Listings;
import java.io.*;
import java.util.*;
public class ReplaceText  {
    public static void main(String[] args) throws Exception {
        //Check command line parameter usage
        if (args.length!=4){
            System.out.println("Usage:java ReplaceText sourceFile targetFile oldStr new Str");
            System.exit(1);
        }
        //Check if source file exists
        File sourceFile=new File(args[0]);
        if (!sourceFile.exists()){
            System.out.println("Source file " +args[0] + " does not exist ");
            System.exit(2);
        }
        //Check if target file exists
        File targetFile=new File(args[1]);
        if (targetFile.exists()){
            System.out.println("Source file " +args[1] + " already exist ");
            System.exit(3);
        }
        try(
                Scanner input=new Scanner(sourceFile);
                PrintWriter output=new PrintWriter(targetFile);
                ){
            while(input.hasNext()){
                String s1=input.nextLine();
                String s2=s1.replaceAll(args[2],args[3] );
                output.println(s2);
            }
        }

    }
}

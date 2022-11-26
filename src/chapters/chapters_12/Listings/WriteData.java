package chapters.chapters_12.Listings;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file=new File("scores.txt");
        if (file.exists()){
            System.out.println("File is already exist");
            System.exit(1);
        }
        PrintWriter output=new PrintWriter(file);
        //Write formatted output to the file
        output.print("John F Kennedy");
        output.println(90);
        output.print("Metehan Guneri");
        output.println(85);

        //close to file
        output.close();


    }
}

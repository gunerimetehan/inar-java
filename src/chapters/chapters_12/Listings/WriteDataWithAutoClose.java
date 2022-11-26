package chapters.chapters_12.Listings;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file=new File("scores3.txt");
        if (file.exists()){
            System.out.println("File is already exists");
            System.exit(1);
        }
        try (PrintWriter output= new PrintWriter(file)){
            output.print("Metehan Guneri ");
            output.println(90);
            output.print("John F Kennedy ");
            output.println(85);

        }

    }
}

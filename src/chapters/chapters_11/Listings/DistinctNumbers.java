package chapters.chapters_11.Listings;
import java.util.Scanner;
import java.util.ArrayList;
public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter integers(input ends with 0):");
        int value;
        do {
            value=input.nextInt();
            if (!list.contains(value) &&value!=0){
                list.add(value);
            }
        }
        while (value!=0);

        //Display the distinct numbers
       // for (int i = 0; i < list.size(); i++) {
         //   System.out.print(list.get(i)+" ");
        // }
        for (int i:list) {
            System.out.print(i + " ");
        }
    }
}

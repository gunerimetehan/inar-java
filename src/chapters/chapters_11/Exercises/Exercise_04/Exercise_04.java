package chapters.chapters_11.Exercises.Exercise_04;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list=getTheListFromUser();

        int largestNumber=findLargestFromArrayList(list);

        System.out.println("The largest element in the list is " + largestNumber);
        System.out.println("Size of the list is " + list.size());
    }
    public static Integer findLargestFromArrayList(ArrayList<Integer> list){
        if (list == null || list.isEmpty())
            return null;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static ArrayList<Integer> getTheListFromUser(){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter integers(ends with 0: ");
        int value=input.nextInt();
        do {
            list.add(value);
            value=input.nextInt();
        }while (value!=0);
        return list;
    }

}

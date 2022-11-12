package chapters.chapters_07_Exercises;
import java.util.Scanner;

/**
 * Can the list includes same integers???
 */
public class Exercise7_28 {
    public static void main(String[] args) {
        int[] list = getAnArrayFromUserWith10Integer();
        displayCombinations(list);
    }
    public static int[] getAnArrayFromUserWith10Integer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers:");
        int[] list=new int[10];
        for (int i = 0; i <list.length ; i++) {
            list[i]=input.nextInt();
        }
        return list;
    }
    public static void displayCombinations(int[] list){
        System.out.println("The combinations are:\n");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i!=j){
                    System.out.print("(" +list[i] + " ," +list[j] + ")" + " " );
                }
            }
        }
    }
}

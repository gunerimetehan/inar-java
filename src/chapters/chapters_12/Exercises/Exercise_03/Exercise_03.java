package chapters.chapters_12.Exercises.Exercise_03;
import java.util.Scanner;
public class Exercise_03 {
    public static void main(String[] args) {
        int[] list=createAnArrayWithRandomIntegers();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the index of related element");
        int index=input.nextInt();

        try{
            System.out.println("The related element is " +list[index]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Index " +index + " is out of bounds");
        }
    }
    public static int[] createAnArrayWithRandomIntegers(){
        int[] list=new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i]=(int) (Math.random()*100);
        }
        return list;
    }
}

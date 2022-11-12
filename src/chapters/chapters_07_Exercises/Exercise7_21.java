package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the balls: ");
        int numberOfBalls=input.nextInt();
        System.out.print("Enter the number of the slots in the machine:");
        int numberOfSlots = input.nextInt();
        int[] slots= new int[numberOfSlots];
        dropBalls(slots,numberOfBalls);
    }
    public static void dropBalls(int[] slots,int numberOfBalls){
        int direction;
        String path=" ";
        for (int i = 0; i < numberOfBalls; i++) {
            for (int j = 0; j < slots.length-1; j++) {
                direction=(int)(Math.random()*2); //Two options left or right
                if (direction%2==0){
                    path+='L';
                }else {
                    path+='R';
                }
            }
            System.out.println(path);
            locationOfBalls(slots,path);
        }
    }
    public static void locationOfBalls(int[] slots,String path){

    }

}

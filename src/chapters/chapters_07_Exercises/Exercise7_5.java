package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_5 {
    public static void main(String[] args) {
        int[] numbers= getFromUser();

    }

    public static int[] getFromUser(){
        int[] numbers=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int index=0;

        for (int i=0;i< numbers.length;i++){
            int number =input.nextInt();
            if (notDuplicated(numbers,number)){
                numbers[index]=number;
                index++;
            }
        }
        System.out.println("The number of distincts are " +index);
        for (int i=0;i<index;i++){
            System.out.print(numbers[i] +" ");
        }
        return numbers;
    }
    public static boolean notDuplicated(int[] numbers,int number){
        for (int n :
                numbers) {
            if (numbers[n]==number){
                return false;
            }
        }
        return true;
    }
    }


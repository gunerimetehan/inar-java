package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number=-1;
        int[] numbers=new int[100];
        int index=0;
        System.out.print("Enter numbers 1-100(ends with '0')");
        while (number!=0){
            number=input.nextInt();
            if (number!=0){
                numbers[index]=number;
                index++;
            }
           /* if(index==numbers.length){
                numbers=resizeArray(numbers);
            }*/
        }
        int[] occurences= countOccurence(numbers);
        displayResult(occurences);
    }
    public static int[] countOccurence(int[] numbers){
        int[] count= new int[100];
        for (int number : numbers){
            if(number!=-1){
                count[number]++;
            }
        }
        return count;
    }
    public static void displayResult(int[] occurence){
        for (int i=1;i< occurence.length;i++){
            if (occurence[i] !=0){
                System.out.print(i + " occurs " + occurence[i]);
                System.out.println((occurence[i]>1) ? "times" : "time");
            }
        }
    }
}

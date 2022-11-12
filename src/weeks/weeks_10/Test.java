package weeks.weeks_10;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the rows and columns of the matrix");
        int rowNumber =input.nextInt();
        int columnsNumber=input.nextInt();
        int[][] array=new int[rowNumber][columnsNumber];
        weeks.weeks_10.TwoDimensionalArrays.fill2DArrWithRandomValues(array,0,20);
        sumRows(array,rowNumber,columnsNumber);

    }

    public static void sumRows(int[][] array,int rowNumber,int columnNumber){
        int rowTotal=0;
        for (int col = 0; col < columnNumber; col++) {
            for (int row = 0; row < array.length; row++) {

                rowTotal=array[col][row];


            }

        }
    }
}

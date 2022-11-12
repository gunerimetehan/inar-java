package weeks.weeks_10;
import sun.plugin.dom.exception.BrowserNotSupportedException;

import java.util.Scanner;
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[2][5];
        printArr(arr);

        System.out.print("Enter the rows and columns of the matrix");
        int rowNumber =input.nextInt();
        int columnsNumber=input.nextInt();
        int[][] array=new int[rowNumber][columnsNumber];
        fill2DArrWithRandomValues(array,10,20);
    }

    private static void printArr(int[][] arr) {
        for (int satır = 0; satır < arr.length ; satır++){
            for (int sütun = 0; sütun < arr[satır].length; sütun++) {
                System.out.print("[] ");
            }System.out.println();
        }

    }
    public static void fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=(int)(Math.random()*(limit-start)+start);
            }

        }
    }
}

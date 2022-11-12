package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_4 {
    public static void main(String[] args) {
        double[] score=getFromUser();
        analyzeScore(score);
    }
    public static double[] getFromUser(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the scores between 1-100(ends with negative): ");
        double[] scores=new double[30];
      //  java.util.Arrays.fill(scores,-1);
        int index=0;
        double number=0;

        while (number>=0){
            number=input.nextDouble();
            scores[index]=number;
            index++;

            //if the array is full
            if (index== scores.length){
                scores=resizeArray(scores);
            }
        }
        return scores;
    }
    public static void analyzeScore(double[] score){
        double average= getAverage(score);
        int countSucceed=0;
        int countFails=0;
        for (int i=0;i<score.length;i++) {
            if (score[i] < 0){
                break;
        }
            if (score[i]>=average){
                countSucceed++;
            }
            else {
                countFails++;
            }
        }
        System.out.println("# scores thats equal or higher to average is " + countSucceed);
        System.out.println("# scores thats lower than the average is " + countFails);
    }
    public static double getAverage(double[] score) {
        double average ;
        double sum = 0;
        int count = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] < 0) {
                break;
            } else {
                sum += score[i];
                count++;
            }
        }
        average = sum / count;
        System.out.println("The average is " +average);
        return average;
    }
    public static double[] resizeArray(double[] scores){
        double[] newArray =new double[scores.length*2];
        java.util.Arrays.fill(newArray,-1);
        //copy the previous array to new one
        System.arraycopy(scores,0,newArray,0,scores.length);
        return newArray;
    }
}

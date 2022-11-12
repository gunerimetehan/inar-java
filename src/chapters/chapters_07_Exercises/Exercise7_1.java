package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of students ");
        int numberOfStudents =input.nextInt();

        double[] studentsScore = new double[numberOfStudents];

        System.out.print("Enter " +numberOfStudents + " score ");
        for (int i=0;i<studentsScore.length;i++){
            studentsScore[i]=input.nextDouble();
        }
        displayGrade(studentsScore);
    }
    public static void displayGrade(double[] score){
        double bestScore=findBestScore(score);
        for (int i=0;i< score.length;i++){
            char grade = findGrade(score[i],bestScore);
            System.out.println("Student " + i + " score is " + score[i] + " and the grade is " + grade) ;
        }
    }
    public static double findBestScore(double[] score){
        double bestScore=score[0];
        for (int i=0;i<score.length;i++){
            if (score[i]>bestScore){
                bestScore=score[i];
            }
        }
        return bestScore;
    }
    public static char findGrade(double score,double bestScore){
        if (score>=bestScore-10){
            return 'A';
        } else if (score >=bestScore-20) {
            return 'B';
        } else if (score>=bestScore-30) {
            return 'C';
        }else {
            return 'D';
        }
    }
}

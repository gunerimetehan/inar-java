package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        String[] studentsNames=new String[number];
        double[] studentScores=new double[number];
        String s="";
        System.out.print("Enter students name and their scores(1 space between name and score): ");
        for (int i = 0; i <number; i++) {
            s=input.nextLine(); //Metehan 90 Metehan Güneri 90--> last space should be considered
            int spaceIndex=s.lastIndexOf(" ");

            studentsNames[i]=s.substring(0,spaceIndex);
            studentScores[i]= Double.parseDouble(s.substring(spaceIndex));
        }
        sortingDesc(studentsNames,studentScores);
    }

    private static void sortingDesc(String[] studentsNames, double[] scores) {
        double maxScore;
        String student;
        int index;

        for (int i = 0; i < studentsNames.length - 1; i++) {
            // Starting with assume
            maxScore = scores[i];
            student = studentsNames[i];
            index = i;

            //Comparing with the remainder of the students
            for (int j = i + 1; j < studentsNames.length; j++) {
                // If it's greater than maxScore assign the greater one to the maxScore
                if (maxScore < scores[j]) {
                    maxScore = scores[j];
                    student = studentsNames[j];
                    index = j;
                }
            }
            // Exchange their position
            if (i != index) {
                studentsNames[index] = studentsNames[i];
                scores[index] = scores[i];
                studentsNames[i] = student;
                scores[i] = maxScore;
            }
        }
    }

    public static void displayScores(String[] studentsName, double[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println(studentsName[i] + " takes " + scores[i]);
        }

    }
}


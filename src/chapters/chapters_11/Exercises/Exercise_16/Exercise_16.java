package chapters.chapters_11.Exercises.Exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        additionQuiz();
    }
    public static void additionQuiz() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> answers = new ArrayList<>();

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer = Integer.MIN_VALUE;

        while (number1 + number2 != answer) {
            System.out.print("What is " + number1 + " + " + number2 + " = ");
            answer = input.nextInt();
            if (number1 + number2 != answer){
                System.out.print("Wrong answer. Try again. ");
            }else{
                System.out.println("You got it!");
            }
            answers.add(answer);
        }

        System.out.println("Your answers were " + answers);
    }
}

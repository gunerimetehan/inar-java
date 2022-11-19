package chapters.chapters_11.Exercises.Exercise_10;
import java.util.Scanner;
public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = getStack(input);
        int size = stack.getSize();

        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }

    public static MyStack getStack(Scanner input) {
        System.out.print("Enter five strings: ");
        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        return stack;
    }
    }


package chapters.chapters_12.Exercises.Exercise_01;

public class WithoutException {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(1);
        }
        String s1 = args[0];
        String s2 = args[2];

        checkInput(s1);
        checkInput(s2);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    public static void checkInput(String str) {
        int i = str.length() - 1;
        while (i >= 0) {

            if (!Character.isDigit(str.charAt(i))) {

                System.out.println("Invalid Input: " + str);
                System.exit(1);
            }
            i--;
        }
    }
}

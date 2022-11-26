package chapters.chapters_12.Exercises.Exercise_01;

public class WithException {
    public static void main(String[] args)  {
        if (new WithException().checkInput(args)) { // Check for non-numeric operands in args[]
            int result = 0;

            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
            }


            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);
        }
    }

    boolean checkInput(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(1);
        }
        try {
            Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {

            System.out.println("Invalid Input: " + args[0]);
            System.exit(1);

        }
        try {
            Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {

            System.out.println("Invalid Input: " + args[2]);
            System.exit(2);
        }
        return true;
    }

}


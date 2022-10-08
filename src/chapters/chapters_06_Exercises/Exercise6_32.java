package chapters.chapters_06_Exercises;

public class Exercise6_32 {
    public static void main(String[] args) {


        int count = 0;
        for (int i=1;i<=10000;i++){
            int rollSum=Exercise6_30.craps();
            if(rollSum==7||rollSum==11){
                System.out.println(" You win");
                count++;
            }
            else if (rollSum==2||rollSum==3||rollSum==12){
                System.out.println(" You lost");
            }
            else {
                int point = rollSum;
                System.out.println("point is " + point);
                while (true) {
                    rollSum = Exercise6_30.craps();
                    if (rollSum == 7) {
                        System.out.println("You lost");break;
                    } else if (rollSum == point) {
                        System.out.println("You win");
                        count++;
                        break;
                    }
                }
            }

        }
        System.out.println(" you won " +count + " times ");
    }
}
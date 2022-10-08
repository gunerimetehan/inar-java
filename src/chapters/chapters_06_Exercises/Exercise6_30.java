package chapters.chapters_06_Exercises;

public class Exercise6_30 {
    public static void main(String[] args) {
        int rollSum=craps();
        if(rollSum==7||rollSum==11){
            System.out.println(" You win");
        }
        else if (rollSum==2||rollSum==3||rollSum==12){
            System.out.println(" You lost");
        }
        else {
            int point = rollSum;
            System.out.println("point is " + point);
            while (true) {
                rollSum = craps();
                if (rollSum == 7) {
                    System.out.println("You lost");break;
                } else if (rollSum == point) {
                    System.out.println("You win");break;
                }
            }
        }

    }
    public static int craps(){

        int dice1=(int)(Math.random()*6)+1;
        int dice2=(int)(Math.random()*6)+1;
        System.out.print(" You rolled " +dice1 + " and " + dice2 + "= " + (dice1+dice2) +"\n");
        return dice1+dice2;
    }
}

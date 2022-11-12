package chapters.chapters_07_Exercises;

public class Exercise7_29 {
    public static void main(String[] args) {
        int[] pick = new int[5];
        pickCards(pick);
        //checkSum(pick);
        displayPicks(pick);
    }
    public static void displayPicks(int[] pick){
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < pick.length-1; i++) {
            System.out.print(ranks[pick[i]%13] + " ");
        }
        System.out.println("\n number of picks " + pick[4]);

    }
    public static void pickCards(int[] pick){
        int sum=0;
        //int count=0;
        while(sum!=24){
            for (int i = 0; i < pick.length-1; i++) {
                pick[i]=(int)(Math.random()*52);
            }
            sum= checkSum(pick);
            //count++;
            pick[4]++;
        }
    }
    public static int checkSum(int[] pick){
        int sum=0;
        for (int i = 0; i < pick.length-1; i++) {
            sum+=pick[i]%13;
        }
        return sum;
    }
}

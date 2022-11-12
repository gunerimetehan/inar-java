package chapters.chapters_07_Exercises;

public class Exercise7_24 {
    public static void main(String[] args) {
        int[] pick=new int[4];
        pickCards(pick);
        displayResult(pick);
    }
    public static void displayResult(int[] pick){
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < pick.length; i++) {
            System.out.println(ranks[pick[i]%13] + " of " + suits[pick[i]/13]);
        }
    }
    public static void pickCards(int[] pick){
        int count=0;

        for (int i = 0; i < pick.length; i++) {
            while(true){
            pick[i]=(int)(Math.random()*52);
            count++;
            if (pickEachOneOfThem(pick,i)){
                break;
            }
        }
        }
        System.out.println("Number of picks: " +count);
    }
    public static boolean pickEachOneOfThem(int[] pick,int i){
        for (int j = 0; j < i; j++) {
            if (pick[j]/13==pick[i]/13){
                return false;
            }
        }
        return true;
    }
}

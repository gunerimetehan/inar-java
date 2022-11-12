package chapters.chapters_07;

public class Listing7_2_DeckOfCards {
    public static void main(String[] args) {
        int[] deck= new int[52];
        String[] suits={"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        for (int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        //Shuffling
       for (int i=deck.length-1;i>0;i--){
            int j= (int) (Math.random()*(i+1));

            int temp=deck[i];
            deck[i]=deck[j];
            deck[j]=temp;
        }
        //display the first 4 cards
        for (int i=0;i<4;i++){
            String suit=suits[deck[i] /13];
            String rank=ranks[deck[i]%13];
            System.out.println(" Card number " + deck[i] + ": " + rank + " of " + suit);
          /*  int cardNumber= (int) (Math.random()*deck.length);
            String suit =suits[cardNumber/13];
            String rank = ranks[cardNumber%13];
            System.out.println(" Card number " + cardNumber + ": " + rank + " of " +suit);
            */
        }
    }
}

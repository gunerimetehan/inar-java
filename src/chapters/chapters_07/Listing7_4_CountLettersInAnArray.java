package chapters.chapters_07;

import chapters.chapters_06.Listing6_10_RandomCharacter;

public class Listing7_4_CountLettersInAnArray {
    public static void main(String[] args) {
        char[] chars=createArray();
        System.out.println("The lowercase letters are");
        displayArray(chars);

        //count the occurences of each letter
        int[] count=countLetters(chars);

        //Display counts
        System.out.println("\nThe occurences of each letter are ");
        displayCounts(count);
    }
    public static char[] createArray(){
        char[] chars=new char[100];
        //Create lowercase letters randomly and assign them to the array
        for (int i=0;i<chars.length;i++){
            chars[i]=Listing6_10_RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }
    //Dispaly the array of characters
    public static void displayArray(char[] chars){
        for (int i=0;i< chars.length;i++){
            if ((i+1)%20==0){ //20 chars in one line
                System.out.println(chars[i]);
            }
            else {
                System.out.print(chars[i] +"");
            }
        }
    }
    public static int[] countLetters(char[] chars){
        int[] count=new int[26];
        for (int i=0;i< chars.length;i++){
            count[chars[i]-'a']++;
        }
        return count;
    }
    public static void displayCounts(int[] count){
            for (int i=0;i< count.length;i++){
                if ((i+1)%10==0){
                    System.out.println(count[i] + " " +(char)(i+'a'));
                }
                else {
                    System.out.print(count[i] + " " +(char)(i+'a') + " ");

                }
            }
    }
}

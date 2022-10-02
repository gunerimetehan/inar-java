package chapters.chapters_06;

public class Listing6_11_TestRandomCharacter {
    public static void main(String[] args) {
        final int numberOfChars =175;
        final int charsPerLine =25;

        //print random characters between 'a' and 'z'
        for(int i=1;i<=numberOfChars;i++){
            char ch = Listing6_10_RandomCharacter.getRandomLowerCaseLetter();
            if(i%charsPerLine==0){
                System.out.println(ch);
            }else{
                System.out.print(ch);
            }
        }
    }
}

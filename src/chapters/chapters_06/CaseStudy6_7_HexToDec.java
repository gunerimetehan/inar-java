package chapters.chapters_06;
import java.util.Scanner;
public class CaseStudy6_7_HexToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a hex number ");
        String hexValue = input.nextLine();
        System.out.println("The decimal value for hex number " +hexValue + " is " + hexToDec(hexValue.toUpperCase()));

    }//ABC8
    public static int hexToDec(String s){
        int decValue =0;
        for(int i=0;i<s.length();i++){
           char hexChar = s.charAt(i);
           decValue= decValue *16 +hexCharToDecimal(hexChar);
        }
        return decValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch>='A' &&ch<='F'){
            return 10 + ch -'A';
        }
        //for ch 0-9
        else {
            return ch -'0';
        }
    }
}

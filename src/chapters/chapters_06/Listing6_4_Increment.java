package chapters.chapters_06;

import java.sql.SQLOutput;

public class Listing6_4_Increment {
    public static void main(String[] args) {
        int x=1;
        System.out.println("x before the invoke" + x);
        increment(x);
        System.out.println("x after the invoke" + x);


    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " +n);
    }
}

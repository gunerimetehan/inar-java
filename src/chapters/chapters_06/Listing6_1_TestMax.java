package chapters.chapters_06;

public class Listing6_1_TestMax {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=max(a,b);
        System.out.println("The max of " +a +" and " + b +" is " + c);

    }
    public static int max(int i1,int i2){
        int result;
        if(i1>i2){
            result =i1;
        }else{
            result =i2;
        }
        return result;
    }
}

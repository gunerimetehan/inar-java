package chapters.chapters_06;

public class KeyPoint_Summation {
    public static void main(String[] args) {
        System.out.println("Sum from 1-10 is " +sum(1,10));
        System.out.println("Sum from 1-10 is " +sum(20,37));
        System.out.println("Sum from 1-10 is " +sum(35,49));


    }
    public static int sum(int i1, int i2){
        int result=0;
        for(int i =i1;i<=i2;i++){
            result+=i;

        }
        return result;
    }
}

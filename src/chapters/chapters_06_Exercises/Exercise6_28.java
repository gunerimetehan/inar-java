package chapters.chapters_06_Exercises;

public class Exercise6_28 {
    public static void main(String[] args) {
        mersennePrime(31);
    }
    public static void mersennePrime(int a){
        System.out.printf("%-2s %8s\n","p","2^p-1");
        System.out.println("_____________");
        for (int i=1;i<=a;i++){
            if (Exercise6_26.isPrime((int)(Math.pow(2,i)-1))){
                System.out.printf("%-2d %2d\n",i,(int)(Math.pow(2,i)-1));
            }
        }
    }
}

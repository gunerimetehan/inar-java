package chapters.chapters_06_Exercises;

public class Exercise6_29 {
    public static void main(String[] args){
        for (int i=1;i<1000;i++){
            if (Exercise6_26.isPrime(i)&&Exercise6_26.isPrime(i+2))
            System.out.printf("( %2d, %2d )\n",i,i+2);
        }
    }
}

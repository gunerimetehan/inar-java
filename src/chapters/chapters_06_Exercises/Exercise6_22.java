package chapters.chapters_06_Exercises;

public class Exercise6_22 {
    public static void main(String[] args) {
        final int n=9;
        System.out.println("The approximate square root of " +n + " is " +sqrt(n));
    }
    public static double sqrt(long n){
        double lastGuess=1;
        double nextGuess=(lastGuess+n / lastGuess)/2;
        while(nextGuess-lastGuess>0.0001){
            lastGuess=nextGuess;
            nextGuess=(lastGuess+n / lastGuess)/2;
        }
        return nextGuess;
    }
}

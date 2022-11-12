package chapters.chapters_07_Exercises;

public class Exercise7_6 {
    public static void main(String[] args) {
        final int numberOfPrimes=50;
        int[] primes=new int[numberOfPrimes];

        fillPrimes(primes);
        Exercise7_10.printArray(primes);
    }
    public static void fillPrimes(int[] primes){
        int index=0;
        int number=2;
       while(index< primes.length){
            if (isPrime(primes,index,number)){
                primes[index]=number;
                index++;
            }
            number++;
        }
    }
    public static boolean isPrime(int[] primes,int index,int number){
        for (int i = 0; i < index; i++) { //Why not less or equal to index??
            if (primes[i]<=Math.sqrt(number)){
                if (number%primes[i]==0){
                    return false;
                }
            }
        }
        return true;
    }
}

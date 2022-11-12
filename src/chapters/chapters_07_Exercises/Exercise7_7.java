package chapters.chapters_07_Exercises;

public class Exercise7_7 {
    public static void main(String[] args) {
   int[] randomIntegers = generateRandomIntegers();
   int[] countIntegers =countDigits(randomIntegers);
   printArray(countIntegers);
    }
    public static int[] generateRandomIntegers(){
        int[] randomIntegers=new int[100];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i]=(int) (Math.random()*10);
        }
        return randomIntegers;
        }
   public static int[] countDigits(int[] numbers){
        int[] digits= new int[10];
        for (int i=0;i< numbers.length;i++){
            digits[numbers[i]]++;
        }
        return digits;
   }
   public static void printArray(int[] countIntegers){
       for (int i = 0; i < countIntegers.length; i++) {
           System.out.print("(" +i + ")" +countIntegers[i] + " ");
       }
   }
}


package chapters.chapters_07_Exercises;

public class Exercise7_18 {
    public static void main(String[] args) {
       double[] numbers= Exercise7_9.getAnArrayFromUser();
       bubbleSort(numbers);
       Exercise7_12.displayArray(numbers);
    }
    public static void bubbleSort(double[] numbers){
        double temp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j< numbers.length-i; j++) {
                if (numbers[j-1]>numbers[j]){
                    temp=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }

    }
}

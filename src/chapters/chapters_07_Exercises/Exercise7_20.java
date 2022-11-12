package chapters.chapters_07_Exercises;

public class Exercise7_20 {
    public static void main(String[] args) {
        double[] array=Exercise7_9.getAnArrayFromUser();
        selectionSort(array);
        Exercise7_12.displayArray(array);
    }
    public static double[] selectionSort(double[] array){
        for (int i = array.length-1; i >=0; i--) {
            double currentMax=array[i];
            int currentMaxIndex=i;

            for (int j = i-1; j >=0 ; j--) {
                if (currentMax<array[j]){
                    currentMax=array[j];
                    currentMaxIndex=j;
                }
            }
            if (currentMaxIndex!=i){
                array[currentMaxIndex]= array[i];
                array[i]=currentMax;
            }
        }
        return array;
    }
}

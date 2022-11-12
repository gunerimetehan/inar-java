package chapters.chapters_07_Exercises;

public class Exercise7_13 {
    public static void main(String[] args) {
        int[] array= generateRandomArray();
        Exercise7_10.printArray(array);
        int randomNumber=randomNumberChooser(array);
        System.out.println("\n" +randomNumber);
    }
    public static int[] generateRandomArray(){
        int[] randomlyGeneratedArray= new int[50];
        for (int i = 0; i < randomlyGeneratedArray.length; i++) {
            randomlyGeneratedArray[i]=(int)(Math.random()*100+1);
        }
        return randomlyGeneratedArray;
    }
    public static int randomNumberChooser(int... array){
        boolean isInArray=true;
        while (true){
            int randomNumber=(int) (Math.random()*53+1);
            for (int i =0; i < array.length ; i++) {
                if (randomNumber==array[i]){
                    isInArray=true;
                    break;
                }
            }
            if (!isInArray){
                isInArray=false;
            }
            return randomNumber;
        }
    }
}

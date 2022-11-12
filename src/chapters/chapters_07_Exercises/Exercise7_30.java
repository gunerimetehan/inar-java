package chapters.chapters_07_Exercises;

public class Exercise7_30 {
    public static void main(String[] args) {
        int[] values=Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();
        isConsecutiveFour(values);
        displayResult(values);
    }
    public static void displayResult(int[] values){
        if (isConsecutiveFour(values)){
            System.out.println("The list has consecutve fours");
        }else {
            System.out.println("The list has no consecutive fours");
        }
    }
    public static boolean isConsecutiveFour(int[] values){

        for (int i = 0; i < values.length-3; i++) {
            int count=0;
            for (int j = i; j < values.length ; j++) {
                if (values[i]==values[j]){
                    count++;
                }
            }
            if (count>=4){
                return true;
            }
        }
        return false;
    }
}

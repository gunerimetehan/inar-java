package chapters.chapters_07_Exercises;

public class Exercise7_15 {
    public static void main(String[] args) {
        double[] list = Exercise7_9.getAnArrayFromUser();
        list =eliminateDuplicates(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
    public static double[] eliminateDuplicates(double[] list){
        double[] newList= new double[list.length];
        int indexOfNewList=0;
        for (int i = 0; i < list.length; i++) {
            if (notDuplicated(newList, (int) list[i])){
                newList[indexOfNewList]=list[i];
                indexOfNewList++;
            }
        }
        double[] eliminatedArray=new double[indexOfNewList];
        System.arraycopy(newList,0,eliminatedArray,0,indexOfNewList);
        return eliminatedArray;
    }
    public static boolean notDuplicated (double[] array, int index){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==index){
                return false;
            }
        }
        return true;
    }
}

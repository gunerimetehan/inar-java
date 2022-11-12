package chapters.chapters_07_Exercises;

public class Exercise7_32 {
    public static void main(String[] args) {
        int[] list=Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();
        partition(list);
        Exercise7_10.printArray(list);
    }

    public static void partition(int[] list){
        int pivot=(int)(Math.random()* list.length);
        System.out.println(pivot);
        for (int i = 0; i < list.length; i++) {
                if (i<pivot){
                    list[i]= (int) (Math.random()* pivot);
                } else if (i>pivot) {
                    list[i]=(int)(Math.random()*100+pivot+1);
                }
        }
    }
}

package chapters.chapters_07_Exercises;

public class Exercise7_27 {
    public static void main(String[] args) {
        int[] list1 = Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();
        int[] list2= Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();

        if(equals(list1,list2)){
            System.out.println("Two lists are identical");
        }else
            System.out.println("Two lists are not identical");
    }
    public static boolean equals(int[] list1, int[] list2){
        if (list1.length !=list2.length){
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            int temp;
            int count=0;
            for (int j = i; j < list2.length ; j++) {
                if (list1[i]==list2[j]){
                    temp=list2[i];
                    list2[i]=list2[j];
                    list2[j]=temp;
                    count++;
                }
                }
            if (count==0){
                return false;
            }
        }
        return true;
    }
}

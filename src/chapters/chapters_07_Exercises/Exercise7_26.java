package chapters.chapters_07_Exercises;

public class Exercise7_26 {
    public static void main(String[] args) {
       int[] list1 = Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();
       int[] list2 = Exercise7_19.getAnArrayFromUserFirstElementIsTheLength();

      if (isStrictlyIdentical(list1,list2)){
          System.out.println("Two lists are strictly identical");
      }else
          System.out.println("Two lists are not strictly identical");
    }
    public static boolean isStrictlyIdentical(int[] list1,int[] list2){
        if (list1.length!=list2.length){
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (!(list1[i]==list2[i])){
                return false;
            }
        }
        return true;
    }
}

package chapters.chapters_07;

public class Listing7_6_LinearSearch {
    public static void main(String[] args) {
        int[] list={1,4,4,2,5,-3,6,2};
        System.out.println(linearSearch(list,-4));
    }
    public static int linearSearch(int[] list, int key){
        for (int i=0;i<list.length;i++){
            if (key==list[i]){
                return i;
            }
        }
        return -1;
    }
}

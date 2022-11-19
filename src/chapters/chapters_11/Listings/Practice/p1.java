package chapters.chapters_11.Listings.Practice;

public class p1 {
    public static void main(String[] args) {

        Integer[] list= {12,24,55,1};
        Double[] list2={12.4,24.0,12.3};
        //int[] list3={1,2,3,4,5};  //Required type Object not integer
        Integer[] list3={1,2,3,4,5};
        printArray(list);
        printArray(list2);
        printArray(list3);

    }
    public static void printArray(Object[] list){
        for (Object o:list) {
            System.out.print(o +" ");
        }
        System.out.println();
    }
}

package chapters.chapters_07;

public class Listing7_8_SelectionSort {
    public static void main(String[] args) {
        int[] list={1,9,4,6,5,-4};
        selectionSort(list);
    }
    public static void selectionSort(int[] list){
        for (int i=0;i< list.length;i++){
            int currentMin=list[i];
            int currentMinIndex=i;

            for (int j=i+1;j< list.length;j++){
                if(currentMin>list[j]){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
         //   System.out.print(list[i] +" ");
        }



    }
}

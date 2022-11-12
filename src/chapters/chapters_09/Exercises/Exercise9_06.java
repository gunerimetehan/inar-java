package chapters.chapters_09.Exercises;

import chapters.chapters_07.Listing7_8_SelectionSort;

public class Exercise9_06 {
    public static void main(String[] args) {
        int[] list=new int[100_000];
        fillArrayWithRandomNumbers(list);


        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Listing7_8_SelectionSort.selectionSort(list);
        stopWatch.stop();
        System.out.println("Selection sort lasts for " +stopWatch.getElapsedTime() +" milliseconds");
    }
    public static void fillArrayWithRandomNumbers(int[] list){
        for (int i = 0; i < list.length; i++) {
            list[i]=(int)(Math.random()*1000);
        }
    }
}

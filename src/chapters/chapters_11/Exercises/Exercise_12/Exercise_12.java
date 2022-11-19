package chapters.chapters_11.Exercises.Exercise_12;
import java.util.ArrayList;

public class Exercise_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        final int size = 5;
        for (int i = size; i > 0; i--) {
            list.add(Math.random()*100);
        }
        System.out.println(list);
        double summation = sum(list);
        System.out.println(summation);
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        while (!list.isEmpty()) {
            sum += list.remove(list.size()-1);
        }
        return sum;
    }
    }

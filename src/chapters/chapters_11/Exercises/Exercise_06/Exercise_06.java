package chapters.chapters_11.Exercises.Exercise_06;

import chapters.chapters_10.Listings.Loan;
import chapters.chapters_11.Listings.CircleFromSimpleGeometricObject;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("a String");
        list.add(new CircleFromSimpleGeometricObject());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) +" ");
        }
    }
}

package chapters.chapters_11.Listings.Practice;

import java.util.ArrayList;

public class p5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Demver");
        list.add("Austin");
         //list.add(new java.util.Date()); //Required type is string
        String city=list.get(0);
        list.set(1,"Dallas");   //Cant set index 3 cause size is 2. With set method you can set an occurring index.For this case 0 or 1
        System.out.println(list.get(1));

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Dallas");
        list1.add("Dallas");
        list1.add("Houston");
        list1.add("Dallas");
        list1.remove("Dallas"); //It removes the first match
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            list1.remove("Dallas");
        }
        System.out.println(list1);

        ArrayList<Double> doubles=new ArrayList<>();
        doubles.add(1.0);
    }
}

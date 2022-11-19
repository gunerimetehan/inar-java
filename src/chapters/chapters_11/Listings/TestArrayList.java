package chapters.chapters_11.Listings;
import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        //Create a list to store cities
        //ArrayList<String> cities= new ArrayList<String>();
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Adana"); //[Adana]
        cities.add("İstanbul"); //[Adana,;istanbul]
        cities.add("Ankara");  //[Adana,İstanbul,Ankara]

        System.out.println("List size?" +cities.size());
        System.out.println("Is Adana in the list" +cities.contains("Adana"));
        System.out.println("The location of İstanbul in the list:" +cities.indexOf("İstanbul"));
        System.out.println("Is the list is empty?" +cities.isEmpty());

        //insert a new city at index 2
        cities.add(2,"İzmir");
        //Remove a city from the list
        cities.remove("Ankara");
        //remove a city at index 1
        cities.remove(1);

        //Display the contents
        System.out.println(cities.toString());

        //Display the contents in reverse order
        for (int i = cities.size()-1; i>=0; i--) {
            System.out.print(cities.get(i) +" ");
        }
        System.out.println();
        //Create a list to store two circles
        ArrayList<CircleFromSimpleGeometricObject> circleList=new ArrayList<>();
        //Add two circles
        circleList.add(new CircleFromSimpleGeometricObject(2));
        circleList.add(new CircleFromSimpleGeometricObject(3));
        //Display the area of the first circle
        System.out.println("The area of the first circle " +circleList.get(0).getArea());

    }
}

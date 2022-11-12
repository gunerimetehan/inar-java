package chapters.chapters_09.Listings;

public class TestPassObjects {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        //Print areas for radius 1,2,3,4 and 5
        int n=5;
        printAreas(myCircle,n);

    }
    public static void printAreas(CircleWithPrivateDataFields myCircle, int times){
        System.out.println("Radius \t\tArea");
        while (times>=1){
            System.out.println(myCircle.getRadius() +"\t\t" +myCircle.getArea()) ;
            myCircle.setRadius(myCircle.getRadius()+1);
            times--;
        }
    }
}

package chapters.chapters_09.Listings;

public class TotalArea {
    public static void main(String[] args) {
        //declare circle array
        CircleWithPrivateDataFields[] circleArrays;

        //create circleArray
        circleArrays=createCircleArrays();
        printCircleArrays(circleArrays);
    }
    //Create an array of objects
    public static CircleWithPrivateDataFields[] createCircleArrays(){
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i]=new CircleWithPrivateDataFields((int)(Math.random()*100));
        }
        return circleArray;
    }
    //print an array of circles and their areas
    public static void printCircleArrays(CircleWithPrivateDataFields[] circleArrays){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i = 0; i < circleArrays.length; i++) {
            System.out.printf("%-30f%-15f\n",circleArrays[i].getRadius(),circleArrays[i].getArea());
        }
        System.out.println("___________________________");
        System.out.printf("%-30s%-15f","The total area of circle is",sum(circleArrays));
    }
    public static double sum(CircleWithPrivateDataFields[] circleArrays){
        double sum=0;
        for (int i = 0; i < circleArrays.length; i++) {
            sum+=circleArrays[i].getArea();
        }
        return sum;
    }
}

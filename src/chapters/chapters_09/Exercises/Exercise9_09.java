package chapters.chapters_09.Exercises;

public class Exercise9_09 {
    public static void main(String[] args) {
    RegularPolygon polygon1 =new RegularPolygon();
        System.out.println("First polygon's perimeter(with no-arg constructor) is "  +polygon1.getPerimeter()
                + " and the area is " + polygon1.getArea());

        RegularPolygon polygon2=new RegularPolygon(6,4);
        System.out.println("Second polygon's perimeter is "  +polygon2.getPerimeter()
                + " and the area is " + polygon2.getArea());

        RegularPolygon polygon3=new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Third polygon's perimeter is "  +polygon3.getPerimeter()
                + " and the area is " + polygon3.getArea());

    }
}

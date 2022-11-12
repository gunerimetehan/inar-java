package chapters.chapters_09.Listings;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creaitng objects");
        System.out.println("Number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);

        //Create c1;
        CircleWithStaticMembers c1=new CircleWithStaticMembers();
        //Display c1
        System.out.println("After creatinng c1");
        System.out.println("c1's radius ( " +c1.radius + " ) and the number of the objects is " +CircleWithStaticMembers.numberOfObjects);
        //create c2
        CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
        //modify c1
        c1.radius=9;
        //Display c1 and c2;
        System.out.println("After creating c2 and modifying c1");
        System.out.println("c1's radius ( " +c1.radius + " ) and the number of the objects is " +c1.numberOfObjects);
        System.out.println("c2's radius ( " +c2.radius + " ) and the numebr of the objects is " +c2.numberOfObjects);
    }
}

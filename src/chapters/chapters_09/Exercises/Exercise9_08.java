package chapters.chapters_09.Exercises;

public class Exercise9_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        //fan1.setSpeed(3);
        fan1.setSpeed(Fan.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("fan1 status is " + fan1.toString() );

        Fan fan2=new Fan();
        fan2.setSpeed(Fan.medium);
        //fan2.setRadius(5);
        //fan2.setColor("blue");
        //fan2.setOn(false);
        System.out.println("fan2 status is " +fan2.toString());
    }
}

package chapters.chapters_12.Practices;

public class p2 {
    public static void main(String[] args) {
        try{
        for (int i = 0; i < 2; i++) {
            System.out.print(i +" ");
            System.out.println(1/0);
        }

        }catch (Exception ex){

        }
    }
}

package weeks.weeks_08;
import java.util.Scanner;
public class Rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = input.nextLine();
        System.out.println("Enter a string");
        String s2 = input.nextLine();
      // boolean result =isRotationOneToAnother(s1,s2,isRotation:false);
        boolean result =isRotationOneToAnother(s1,s2);
        System.out.println(result);
        }

    public static boolean isRotationOneToAnother (String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
    }
        String s3=s1+s2;
        return s3.contains(s2);
    }
    public static boolean isRotationOneToAnother(String s1,String s2,Boolean isRotation){
        if(s1.length()!=s2.length()){
            return false;
        }
        int size =s1.length();

        for(int i=0;i<size;i++){
            if(s2.equals(rotation(s1,i))){
                return true;
            }
        }
        return false;
    }
    public static String rotation(String s1,int i){
        String s3="";
        for(int j=i;j<s1.length();j++){
            s3 += s1.charAt(i);
        }
        for (int j=0;j<i;j++){
            s3+=s1.charAt(j);
        }
        return s3;
    }
}

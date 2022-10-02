package chapters.chapters_06;

public class Listing6_5_PassByValue {
    public static void main(String[] args) {
    int num1=1;
    int num2=2;
        System.out.println("Before invoking the swap num1 is" +num1 + " and num2 is " + num2);
        swap(num1,num2);
        System.out.println("After invoking the swap num1 is " +num1 + " and num2 is " +  num2);
    }
    public static void swap(int n1, int n2){
        System.out.println("\t Inside the swap method");
        System.out.println("\t\tBegore the swapping, n1 is," + +n1 + " and n2 is " + n2);

        //Swap n1 and n2
        int temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("\t\tAfter the swapping, n1 is " + n1 + " and n2 is " + n2) ;
    }
}

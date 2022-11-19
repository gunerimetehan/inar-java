package chapters.chapters_11.Listings.Practice;

public class p2 {
    public static void main(String[] args) {
        A a=new A(3);
    }
}
class A extends B{
    public A(int t){
        System.out.println("A's constructor invoked");
    }
}

class B {
    public B(){
        System.out.println("B's constructor invoked");
    }
}

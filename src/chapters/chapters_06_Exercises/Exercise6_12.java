package chapters.chapters_06_Exercises;

public class Exercise6_12 {
    public static void main(String[] args) {
    printChars('1','Z',10);
    }
    public static void printChars(char ch1,char ch2,int numberPerLine){
        int count=0;
        for (int i=ch1;i<=ch2;i++){
            count++;
        if(count%numberPerLine==0){
            System.out.println((char)i);
        }
        else{
            System.out.print((char)i +" ");
        }

        }

    }
}

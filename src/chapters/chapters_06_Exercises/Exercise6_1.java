package chapters.chapters_06_Exercises;

public class Exercise6_1 {
    public static void main(String[] args) {
        int n=100;
        int numbersPerLine=10;
        System.out.println(" The first " +n + " pentagonal numbers are ");
        for(int i=1;i<=n;i++) {
            if((i-1)%numbersPerLine==0){
                System.out.println();
            }
            System.out.printf("%8d",getPentagonalNumber(i));
        }

    }
    public static int getPentagonalNumber(int a){
            int pentagonalNumber = (int) (a * (3 * a - 1) / 2.0);
            return pentagonalNumber;
        }
    }


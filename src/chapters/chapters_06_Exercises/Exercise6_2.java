package chapters.chapters_06_Exercises;

public class Exercise6_2 {
    public static void main(String[] args) {
        //4,0,-15,100 -->Negatif sayıların basamak değerleri mi toplanmalı yoksa tüm basamaklar negatif olarak mı kabul edilmeli???
        final long n=1234;
        System.out.println(sumDigit(n));
    }
    public static int sumDigit(long a){
        int sum=0;
        while(a!=0){
        sum += a%10;
        a/=10;
        }
        return sum;
    }

    public static class Exercise6_13 {
        public static void main(String[] args) {
            final int series=20;
           printTable(series);
        }
        public static void printTable(int k){
            System.out.printf("%2s %8s","i","m(i)");
            System.out.println("\n____________");
            for (int i=1;i<=k;i++){
                System.out.printf("%2d %8.4f\n",i,sumSeries(i));
            }
        }
        public static double sumSeries(int a){
            double sum=0;
            for (int i=1;i<=a;i++) {
                sum += i / (i + 1.0);
            }
            return sum;
        }
    }
}


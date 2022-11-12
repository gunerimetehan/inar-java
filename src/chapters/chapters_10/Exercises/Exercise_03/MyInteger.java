package chapters.chapters_10.Exercises.Exercise_03;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
      return value%2==0;
    }
    public boolean isOdd(){
      return value%2!=0;
    }
    public boolean isPrime(){
        if (value<2){
            return false;
        }
        else {
            for (int i = 2; i < Math.sqrt(value); i++) {
                if (value%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEven(int value){
        return value%2==0;
    }
    public static boolean isOdd(int value){
        return value%2!=0;
    }
    public static boolean isPrime(int value){
        if (value<2){
            return false;
        }
        else {
            for (int i = 2; i < Math.sqrt(value); i++) {
                if (value%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger value){
        return isEven(value.getValue());
    }
    public static boolean isOdd(MyInteger value){
        return isOdd(value.getValue());
    }
    public static boolean isPrime(MyInteger value){
        return isPrime(value.getValue());
    }
    public boolean equals(int n) {
        return getValue() == n;
    }

    public boolean equals(MyInteger num) {
        return equals(num.getValue());
    }
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }


    public static int parseInt(char[] arr) {
        //return parseInt(new String(arr));

        int num = 0;
        int v;
        for (int i = arr.length - 1, p = 0; i >= 0; i--, p++) {
            // Cast inti int automatically because ve assign the result to an int variable
            v = arr[i] - '0';
            num += Math.pow(10, p) * v;
        }

        return num;
    }
}

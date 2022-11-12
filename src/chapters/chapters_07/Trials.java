package chapters.chapters_07;

public class Trials {
    public static void main(String[] args) {

        //shuffling();
        //shifting();
        //monthsName();
        //arrayCopy();
      /*  int x=1;
        int[] y=new int[10];
        passBySharing(x,y);
        System.out.println("x is " +x);
        System.out.println("y[0] is " +y[0] );
        */
        //returning an array
        int[] list1= {1,2,3,4,5,6};
        int[] list2=reverse(list1);
        for (int i=0;i< list2.length;i++){
            System.out.print(list2[i] +"");
        }
    }

    public static void shuffling() {
        double[] myList = new double[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = i;
            System.out.print(myList[i] + " ");
        }
        System.out.println();
        for (int i = myList.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1)); //Generated a random number between the indices

            //swapping
            double temp = myList[i];  //i sürekli azalacığından değiştirilen indexler tekrar değiştirilmeyecek.
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.print(myList[i] + " ");
        }

    }

    public static void shifting() {
        double[] myList = new double[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = i;
            System.out.print(myList[i] + " ");
        }
        System.out.println();
            double temp = myList[0];
            for (int i = 1; i < myList.length; i++) {
                myList[i - 1] = myList[i];
                System.out.print(myList[i] + " ");
            }
            myList[myList.length - 1] = temp;
        System.out.print(myList[myList.length-1]);

        }

        public static void monthsName(){
        String[] months ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int monthNumber = (int) (Math.random()*12+1);
            System.out.println(monthNumber);
            System.out.println("The months is " +months[monthNumber-1]);

            float[] f= new float[5];
            f[0] = (float) 1.2;
            for (float e:f) {
                System.out.println(e);
            }

        }

        public static void arrayCopy(){
        int[] source={3,4,5};
        int[] targetArr= new int[5];
        for (int i=0;i<targetArr.length;i++){
            System.out.print(targetArr[i]);
        }
            System.arraycopy(source,0,targetArr,0,source.length);
            System.out.println();
            for (int i=0;i< targetArr.length;i++) {
                System.out.print(targetArr[i]);
            }
            System.out.println();
            targetArr = new int[10]; // default değerlerle size'ı 10 olan yeni bir targetArr arrayi oluşturdu.
            for (int i=0;i<targetArr.length;i++){
                System.out.print(targetArr[i]);
            }
        }
        public static void passBySharing(int number,int[] numbers){
        number=1010;
        numbers[0]=5555;
        }

        public static int[] reverse(int[] list){
        int[] result=new int[list.length];
        for (int i=0,j=result.length-1;i< list.length;i++,j--){
            result[j]=list[i];
        }
        return result;
    }
    }

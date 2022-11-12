package chapters.chapters_07_Exercises;

public class Exercise7_23 {
    //1 3 4 5 7 11 13...
    public static void main(String[] args) {
        boolean[] locker=new boolean[100];
        studentsAction(locker);
        displayOpenLockers(locker);
    }

    private static void displayOpenLockers(boolean[] locker) {
        System.out.print("The open lockers are ");
        for (int i = 0; i < locker.length; i++) {
            if (locker[i]){
                System.out.print((i+1) + " ");
            }
        }
    }

    public static void studentsAction(boolean[] locker){
        for (int i = 0; i < 2; i++) {
            changeLockersFirstTwoStudent(locker,i);
        }
        for (int i = 2; i < locker.length ; i++) {
            changerLockersOtherStudents(locker,i);
        }
    }
    public static void changeLockersFirstTwoStudent(boolean[] locker, int i){
        for (int j = i; j < locker.length; j++) { //First two students take action for every lockers begins with their own indices.
            locker[j] = !locker[j];
        }
    }
    public static void changerLockersOtherStudents(boolean[] locker,int i){
        for (int j = i; j < locker.length; j+=i+1) { //Other students take action for every ith lockers.We must make it i+1 so indice starts with 0.
            locker[j]= !locker[j];
        }
    }
}

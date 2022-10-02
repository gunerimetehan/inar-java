package chapters.chapters_06;

public class Listing6_3_ReturnGradeMethod {
    public static void main(String[] args) {
        System.out.print("The grade is " +getGrade(78.5) );
        System.out.print("\nThe grade is " +getGrade(60.0));

    }
    public static char getGrade(double score){
        if(score>=90){
            return 'A';
        } else if (score>=80) {
        return 'B';
        }
        else if (score>=70){
            return 'C';
        }
        else if (score>=60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}

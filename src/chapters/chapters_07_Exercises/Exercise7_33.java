package chapters.chapters_07_Exercises;
import java.util.Scanner;
public class Exercise7_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter a year: ");
        int year = input.nextInt();
        getChineseZodiac(year);
    }
    public static void getChineseZodiac(int year){
        String[] zodiacs={"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon",
                "Snake", "Horse", "Sheep"};
        System.out.println(year + " is " + zodiacs[year%12] + " year in Chinese Zodiac");
    }
}


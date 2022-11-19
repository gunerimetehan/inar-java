package chapters.chapters_10.Exercises.Exercise_25;

public class Exercise_25 {
    public static void main(String[] args) {
        String s = "?ab?babc?#gfe?";
        String reg = "[#?]";
        String[] split = split(s, reg);
        displaySplit(split);
    }

    public static void displaySplit(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static String[] split(String s, String regex) {

        int size = findTheNecessarySize(s,regex);

        String[] s1 = new String[size];
        String tempS = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!isRegex(s.charAt(i), regex)) {
                tempS = tempS + s.charAt(i);
            }

            if (isRegex(s.charAt(i), regex)) {
                if (!tempS.equals("")) {
                    s1[index++] = tempS;
                    tempS = "";
                }
                s1[index++] = s.charAt(i) + "";
            }

        }

        if (!tempS.equals("")) {
            s1[index] = tempS;

        }
        return s1;
    }

    public static boolean isRegex(char c, String regex) {
        for (int i = 0; i < regex.length(); i++) {
            if (c == regex.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static int findTheNecessarySize(String s, String regex) {
        int count = 0;
        int countRegex = 0;

        if (isRegex(s.charAt(0), regex)) {
            countRegex++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (isRegex(s.charAt(i), regex)) {
                if (!isRegex(s.charAt(i - 1), regex)) {
                    count++;
                }
                countRegex++;
            }
        }
        if (!isRegex(s.charAt(s.length() - 1), regex)) {
            count++;

        }
        return countRegex + count;
    }
}

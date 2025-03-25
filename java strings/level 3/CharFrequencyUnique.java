import java.util.Scanner;

public class CharFrequencyUnique {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static char[] uniqueCharacters(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueIndex] = current;
                uniqueIndex++;
            }
        }

        char[] trimmed = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            trimmed[i] = unique[i];
        }

        return trimmed;
    }

    public static String[][] getFrequency(String text) {
        int[] freq = new int[256];

        int len = getLength(text);
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("   %s      |    %s\n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = getFrequency(input);
        displayResult(result);
    }
}

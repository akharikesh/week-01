import java.util.Scanner;

public class WordLength {

    public static int findLength(String str) {
        int count = 0;
        while (true) {
            if (isCharAvailable(str, count)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static boolean isCharAvailable(String str, int index) {
        char[] chars = str.toCharArray();
        if (index >= 0 && index < chars.length) {
            return true;
        }
        return false;
    }

    public static String[] customSplit(String str) {
        int len = findLength(str);

        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                words[wordIndex++] = currentWord.toString();
                currentWord = new StringBuilder();
            }
        }

        words[wordIndex] = currentWord.toString();

        return words;
    }

    public static String[][] wordWithLengths(String[] words) {
        int wordCount = 0;
        while (wordCount < words.length) wordCount++;

        String[][] result = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordWithLengths(words);

        System.out.println("\nWord\tLength");
        System.out.println("----\t------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

        scanner.close();
    }
}
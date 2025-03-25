import java.util.Scanner;

public class WordAnalyzer {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitText(String str) {
        int len = getLength(str);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                words[index++] = word.toString();
                word = new StringBuilder();
            }
        }
        words[index] = word.toString(); 
        return words;
    }

    public static String[][] wordLengthTable(String[] words) {
        int count = 0;
        while (count < words.length) count++;

        String[][] table = new String[count][2];

        for (int i = 0; i < count; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }

        return table;
    }

    public static String[] findMinMax(String[][] wordTable) {
        String shortest = wordTable[0][0];
        String longest = wordTable[0][0];
        int minLen = Integer.parseInt(wordTable[0][1]);
        int maxLen = minLen;

        for (int i = 1; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);

            if (length < minLen) {
                minLen = length;
                shortest = wordTable[i][0];
            }

            if (length > maxLen) {
                maxLen = length;
                longest = wordTable[i][0];
            }
        }

        return new String[] { shortest, longest };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitText(input);
        String[][] table = wordLengthTable(words);
        String[] minMax = findMinMax(table);

        System.out.println("\nWord\tLength");
        System.out.println("----\t------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

        System.out.println("\nShortest Word: " + minMax[0]);
        System.out.println("Longest Word : " + minMax[1]);

        scanner.close();
    }
}
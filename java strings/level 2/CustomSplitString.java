import java.util.Scanner;

public class CustomSplitString {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] customSplit(String str) {
        int length = findLength(str);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndices = new int[wordCount + 1];
        int index = 0;
        spaceIndices[index++] = -1; 

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }

        spaceIndices[index] = length; 

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndices[i] + 1; j < spaceIndices[i + 1]; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] customWords = customSplit(input);
        String[] builtInSplit = input.split(" ");

        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        boolean areEqual = compareArrays(customWords, builtInSplit);
        System.out.println("\nAre both methods equal? " + areEqual);

        scanner.close();
    }
}
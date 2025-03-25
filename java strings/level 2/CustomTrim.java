import java.util.Scanner;

public class CustomTrim {

    public static int getLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    public static int[] getTrimIndices(String str) {
        int len = getLength(str);
        int start = 0;
        int end = len - 1;

        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = getLength(s1);
        int len2 = getLength(s2);

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] trimIndices = getTrimIndices(input);
        String trimmedCustom = getSubstring(input, trimIndices[0], trimIndices[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("\nCustom Trimmed String: [" + trimmedCustom + "]");
        System.out.println("Built-in Trimmed String: [" + trimmedBuiltIn + "]");

        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("\nAre both strings equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
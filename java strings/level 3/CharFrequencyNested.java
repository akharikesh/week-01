import java.util.Scanner;

public class CharFrequencyNested {

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = "'" + chars[i] + "' -> " + freq[i];
            }
        }

        String[] trimmedResult = new String[index];
        for (int i = 0; i < index; i++) {
            trimmedResult[i] = result[i];
        }

        return trimmedResult;
    }

    public static void display(String[] arr) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (String line : arr) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] result = findFrequency(input);
        display(result);
    }
}

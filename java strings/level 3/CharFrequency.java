import java.util.Scanner;

public class CharFrequency {

    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256]; 

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break; 
            }
        }

        int uniqueCount = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                if (!visited[ch]) {
                    visited[ch] = true;
                    uniqueCount++;
                }
            } catch (Exception e) {
                break;
            }
        }

        String[][] result = new String[uniqueCount][2];
        visited = new boolean[256];
        int index = 0;

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                if (!visited[ch]) {
                    visited[ch] = true;
                    result[index][0] = String.valueOf(ch);
                    result[index][1] = String.valueOf(freq[ch]);
                    index++;
                }
            } catch (Exception e) {
                break;
            }
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

        String[][] result = getCharFrequency(input);
        displayResult(result);
    }
}

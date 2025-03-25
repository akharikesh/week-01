import java.util.Scanner;

public class LowerCaseConverter {

    public static String convertToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32)); 
            } else {
                result.append(ch); 
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String manualLower = convertToLower(original);
        String builtInLower = original.toLowerCase();
        boolean areEqual = compareStrings(manualLower, builtInLower);
        System.out.println("\nManual Conversion: " + manualLower);
        System.out.println("Built-in Conversion: " + builtInLower);
        System.out.println("Both methods give same result? " + areEqual);

        scanner.close();
    }
}
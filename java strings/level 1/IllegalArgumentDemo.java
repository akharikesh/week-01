import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        String sub = text.substring(5, 2); 
        System.out.println("Substring: " + sub);
    }
    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2); 
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(userInput); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(userInput); 

        scanner.close();
    }
}
import java.util.Scanner;

public class StringIndexOutOfBoundsException {
    public static void generateException(String text) {
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsExceptiondemo e) {
            System.out.println("Caught Exception: Index out of bounds! The string length is " + text.length());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(userInput); 
        } catch (StringIndexOutOfBoundsExceptiondemo e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(userInput);

        scanner.close();
    }
}
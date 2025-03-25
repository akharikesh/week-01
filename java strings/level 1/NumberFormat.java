import java.util.Scanner;

public class NumberFormat {

    public static void generateException(String text) {
        int number = Integer.parseInt(text); 
        System.out.println("Converted Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text); 
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to integer: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(input); 
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(input); 

        scanner.close();
    }
}
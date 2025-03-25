import java.util.Scanner;

public class ArrayIndex {

    public static void generateException(String[] names, int index) {
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Alice", "Bob", "Charlie", "Diana"};

        System.out.print("Enter an index to access (0 to " + (names.length - 1) + "): ");
        int index = scanner.nextInt();

        generateException(names, index);

        scanner.close();
    }
}
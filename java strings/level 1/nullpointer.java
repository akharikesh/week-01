public class nullpointer {
    public static void generateException() {
        String text = null;
        System.out.println("Text length: " + text.length());
    }
    public static void handleException() {
        String text = null;

        try {
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call methods on a null object!");
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Generating Exception ----");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n---- Handling Exception ----");
        handleException();
    }
}
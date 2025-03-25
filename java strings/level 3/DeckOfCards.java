import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", 
                           "Jack", "Queen", "King", "Ace" };

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCard = i + (int) (Math.random() * (n - i));
            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (players <= 0 || n <= 0 || players * (n / players) > deck.length) {
            System.out.println(" Invalid distribution: Not enough cards or invalid input.");
            return null;
        }

        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];

        int deckIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[deckIndex++];
            }
        }

        return distributed;
    }

    public static void printPlayerCards(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter total number of cards to deal (max 52): ");
        int totalCards = sc.nextInt();

        System.out.print("Enter number of players: ");
        int numberOfPlayers = sc.nextInt();

        String[][] players = distributeCards(deck, totalCards, numberOfPlayers);
        printPlayerCards(players);
    }
}

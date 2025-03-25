import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static void displayResults(String[][] results, int userWins, int compWins, int draws) {
        System.out.println("\nGame Summary:");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-10s\n", i + 1, results[i][0], results[i][1], results[i][2]);
        }

        int totalGames = results.length;
        double userWinPct = (userWins * 100.0) / totalGames;
        double compWinPct = (compWins * 100.0) / totalGames;

        System.out.println("\nStatistics:");
        System.out.println("User Wins: " + userWins + ", Computer Wins: " + compWins + ", Draws: " + draws);
        System.out.printf("User Win Percentage: %.2f%%\n", userWinPct);
        System.out.printf("Computer Win Percentage: %.2f%%\n", compWinPct);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        scanner.nextLine(); 

        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        displayResults(results, userWins, compWins, draws);
    }
}
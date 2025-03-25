import java.util.Scanner;

public class kilometer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int km = input.nextInt();
		double mile =1.6*km;
		System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
	}
}
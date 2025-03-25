import java.util.Scanner;

class height {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int heigh = input.nextInt();
		double inch = 2.54*heigh;
		double foot = 12*inch;
		System.out.println("Your height in cm is " + heigh + " while in feet is " + foot + " and inches is " + inch);
	}
}
		
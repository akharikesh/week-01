import java.util.Scanner;

class quatientreminder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		double quatient = num1/num2;
		double reminder = num1%num2;
		System.out.println("The Quotient is " + quatient + " and Reminder is " + reminder + " of two number " + num1 + " and " + num2);
	}
}

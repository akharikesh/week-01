import java.util.Scanner;

class totalincome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int salary = input.nextInt();
		int bonus = input.nextInt();
		int totincome = salary + bonus;
		System.out.println("The salary in INR " + salary + " and bonus in INR " + bonus + " .Hence Total Income is INR " + totincome);
	}
}
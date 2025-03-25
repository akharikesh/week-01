import java.util.Scanner;

class smallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		boolean ismallest = (num1<num2)&&(num1<num3);
		System.out.println(" Is the first number the smallest? " + ismallest);
	}
}

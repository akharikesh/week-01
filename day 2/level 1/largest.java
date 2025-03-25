import java.util.Scanner;

class largest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		boolean isfirst = (num1>num2)&&(num1>num3);
		boolean issecond = (num2>num1)&&(num2>num3);
		boolean isthird = (num3>num1)&&(num3>num2);
		System.out.println("Is the first number the largest? " + isfirst);
		System.out.println("Is the second number the largest? " + issecond);
		System.out.println("Is the third number the largest? " + isthird);
	}
}

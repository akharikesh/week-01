import java.util.Scanner;

class largestsmallest {
	public static int[] largesmall (int num1, int num2, int num3){
		int largest = Math.max(num1, Math.max(num2, num3));
		int smallest = Math.min(num1, Math.min(num2, num3));
		return new int[]{largest, smallest};
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int[] result = largesmall(num1, num2, num3);
		System.out.println("The largest numbers is " + result[0]);
		System.out.println("The smallest numbers is " + result[1]);
	}
}
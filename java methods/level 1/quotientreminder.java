import java.util.Scanner;

class quotientreminder {
	public static int[] quotrem (int num1, int num2){
		int quotient =num1/num2;
		int reminder =num1%num2;
		return new int[]{quotient, reminder};
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int[] result = quotrem(num1, num2);
		System.out.println("The quotient is " + result[0]);
		System.out.println("The reminder is " + result[1]);
	}
}
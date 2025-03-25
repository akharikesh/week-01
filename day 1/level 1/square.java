import java.util.Scanner;

class square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int perimeter = input.nextInt();
		double length = perimeter/4;
		System.out.println("The length of the side is " + length + " whose perimeteris " + perimeter);
	}
}
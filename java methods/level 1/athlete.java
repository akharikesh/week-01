import java.util.Scanner;

class athlete {
	public static int triangle(int side1, int side2, int side3, int distance){
		return (distance/(side1+side2+side3));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		int result = triangle(side1,side2,side3,5000);
		System.out.println("The number of rounds is " + result);
	}
}
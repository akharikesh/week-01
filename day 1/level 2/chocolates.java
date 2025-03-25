import java.util.Scanner;

class chocolates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noofchocolates = input.nextInt();
		int noofchildren = input.nextInt();
		int chocolateperchild = noofchocolates/noofchildren;
		int remainingchocolates = noofchocolates%noofchildren;
		System.out.println("The number of chocolates each child gets is " + chocolateperchild + " and the number of remaining chocolates are " + remainingchocolates);
	}
}
import java.util.Scanner;

class totalprice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantity = input.nextInt();
		double unitprice = input.nextDouble();
		double totprice = quantity*unitprice;
		System.out.println("The total purchase price is INR " + totprice + " if the quantity " + quantity + " and unit price is INR " + unitprice);
	}
}
	
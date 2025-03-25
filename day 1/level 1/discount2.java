import java.util.Scanner;

class discount2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		int discountpercent = input.nextInt();
		int discountamount = (fee*discountpercent)/100;
		int finalfee = fee - discountamount;
		System.out.println(" The discount amount is INR " + discountamount + " and the final discounted fee is INR " + finalfee);
	}
}
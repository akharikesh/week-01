import java.util.Scanner;

class naturalnumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num>0){
			int sum = num*(num+1)/2;
			System.out.println("The sum " + num + " natural numbers is " + sum);
		} else {
			System.out.println("The number " + num + " is not a natural number");
		}
		input.close();
	}
}
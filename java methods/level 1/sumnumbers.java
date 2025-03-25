import java.util.Scanner;

class sumnumbers {
	public static int sumnum (int num){
		int sum = 0;
		for (int i=0;i<=num;i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = sumnum(num);
		System.out.println("The sum of numbers is " + sum);
	}
}
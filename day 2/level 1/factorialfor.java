import java.util.Scanner;

class factorialfor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int sum=1;
		for (int i=1;i<=num;i++){
			sum*=i;
		}
		System.out.println(sum);
	}
}
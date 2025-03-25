import java.util.Scanner;

class factorialwhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum=1;
		int i=1;
		while(i<=num){
			sum*=i;
			i++;
		}
		System.out.println(sum);
	}
}
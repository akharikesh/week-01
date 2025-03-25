import java.util.Scanner;

class compareresultfor {
	public static int usingwhile(int num){
		int sum=0;
		for (int i=1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num>0){
			int sumformulae=num*(num+1)/2;
			int sumloop=usingwhile(num);
			if(sumformulae==sumloop){
				System.out.println("The two results are same and the sum is " + sumloop);
			}
		}else{
			System.out.println("Invalid number");
		}
		input.close();
	}
}
		
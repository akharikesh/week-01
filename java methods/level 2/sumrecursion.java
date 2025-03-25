import java.util.Scanner;

class sumrecursion {
	public static int recusion(int num){
		if (num==0){
			return 0;
		}
		return num + recusion(num-1);
	}
	public static int sumnumbers(int num){
		int sum = num*(num+1)/2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result1 = recusion(num);
		int result2 = sumnumbers(num);
		if (result1==result2){
			System.out.println("The both computation are equal and the result is " + result1);
		}else{
			System.out.println("None");
		}
	}
}
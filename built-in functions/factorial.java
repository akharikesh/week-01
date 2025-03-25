import java.util.Scanner;

public class factorial {
	public static int getinput(){
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		return num;
	}
	public static long isfactorial(int n){
		if (n==0 || n==1){
			return 1;
		}else{
			return n*isfactorial(n-1);
		}
	}
	public static void displayresult (int num, long result){
		System.out.println("Factorial of " + num + " is " + result);
	}
	public static void main (String[] args){
		int number = getinput();
		long fact = isfactorial(number);
		displayresult(number, fact);
	}
}
import java.util.Scanner;

public class gcdlcm {
	public static int[] getinput(){
		Scanner input = new Scanner(System.in);
		int num1 =  input.nextInt();
		int num2 =  input.nextInt();
		return new int[] {num1, num2};
	}
	public static int findgcd(int num1, int num2){
		if (num2==0){
			return num1;
		}
		return findgcd(num2, num1%num2);
	}
	public static int findlcm(int num1, int num2, int gcd){
		return (num1*num2)/gcd;
	}
	public static void displayresult (int num1, int num2, int gcd, int lcm){
		System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
		System.out.println("GCD of " + num1 + " and " + num2 + " is : " + lcm);
	}
	public static void main (String[] args){
		int[] number = getinput();
		int num1 = number[0];
		int num2 = number[1];
		int GCD = findgcd(num1, num2);
		int LCM = findlcm(num1, num2, GCD);
		displayresult(num1, num2, GCD, LCM);
	}
}
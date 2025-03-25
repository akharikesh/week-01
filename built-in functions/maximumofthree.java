import java.util.Scanner;
  
class maximumofthree {
	public static int getinput (Scanner input, String prompt){
		System.out.print(prompt);
		return input.nextInt();
	}
	public static int findmax (int a, int b, int c){
		int max = a;
		if (b>max){
			max = b;
		}
		if (c>max){
			max = c;
		}
		return max;
	}
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int num1 = getinput(input, "first number: ");
		int num2 = getinput(input, "second number: ");
		int num3 = getinput(input, "third number: ");
		int max = findmax(num1, num2, num3);
		System.out.println("The maximum of three numbers is : " + max);
	}
}
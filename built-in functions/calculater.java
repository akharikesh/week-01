import java.util.Scanner;

public class calculater {
	public static double addition (double a, double b){
		return a+b;
	}
	public static double subtraction (double a, double b){
		return a-b;
	}
	public static double multiplication (double a, double b){
		return a*b;
	}
	public static double division (double a, double b){
		if (b==0){
			System.out.println("cannot divide by zero");
			return Double.NaN;
		}
		return a/b;
	}
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        System.out.println("choose an operation ");
        System.out.println("1. Addition ");
        System.out.println("1. Subtraction ");
		System.out.println("1. Multilication ");
		System.out.println("1. Division ");
        System.out.print("Choose an option (1-4): ");
        int choice = input.nextInt();
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double result =0;
		switch (choice){
			case 1 : 
			result = addition(num1, num2);
			System.out.println("Result: " + result);
			break;
		    case 2 :
			result = subtraction(num1, num2);
			System.out.println("Result: " + result);
			break;
			case 3 :
			result = multiplication(num1, num2);
			System.out.println("Result: " + result);
			break;
			case 4 : 
			result = subtraction(num1, num2);
			if (!Double.isNaN(result)){
				System.out.println("Result: " + result);
			}
			break;
			default :
			System.out.println("Invalid choice");
		}
	}
}
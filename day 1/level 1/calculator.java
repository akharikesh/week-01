import java.util.Scanner;

class calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		double addition = num1+num2;
		double subtraction = num1-num2;
		double multiplication = num1*num2;
		double division = num1/num2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + addition + " , " + subtraction + " , " + multiplication + " and " + division);
	}
}
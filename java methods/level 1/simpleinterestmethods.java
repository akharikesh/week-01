import java.util.Scanner;

class simpleinterestmethods {
	public static double simpleinterest (double principal, double rate, double time){
		return (principal*rate*time)/100;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		double simplei = simpleinterest(principal, rate, time );
		System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.%n", simplei, principal, rate, time);
	}
}
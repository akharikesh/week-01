import java.util.Scanner;

public class trignometry {
	public static double[] trignometricfunc(double angle){
		double radians = Math.toRadians(angle);
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tang = Math.tan(radians);
		return new double[] {sine, cosine, tang};
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double angle = input.nextDouble();
		double[] results = trignometricfunc(angle);
	System.out.printf("sine: %.4f%n", results[0]);
	System.out.printf("cosine: %.4f%n", results[1]);
	System.out.printf("tan: %.4f%n", results[2]);
	}
}
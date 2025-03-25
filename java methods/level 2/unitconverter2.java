import java.util.Scanner;

class unitconverter2 {
	public static double yardstofeet(double yards){
		return yards*3;
	}
	public static double feettoyards(double feet){
		return feet*0.333333;
	}
	public static double metertoinches(double meter){
		return meter*39.3701;
	}
	public static double inchestometer(double inches){
		return inches*0.0254;
	}
	public static double inchestocm(double inches){
		return inches*2.54;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double yards = input.nextDouble();
		double feet = input.nextDouble();
		double meter = input.nextDouble();
		double inches = input.nextDouble();
		System.out.println(yards + " yards is " + yardstofeet(yards) + " feet");
		System.out.println(feet + " feet is " + feettoyards(feet) + " yards");
		System.out.println(meter + " meter is " + metertoinches(meter) + " inches");
		System.out.println(inches + " inches is " + inchestometer(inches) + " meter");
		System.out.println(inches + " inches is " + inchestocm(inches) + " cm");
	}
}
import java.util.Scanner;

class unitconverter {
	public static double kmtomiles(double km){
		return km*0.621371;
	}
	public static double milestokm(double miles){
		return miles*1.60934;
	}
	public static double metertofeet(double meter){
		return meter*3.28084;
	}
	public static double feettometer(double feet){
		return feet*0.3048;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();
		double miles = input.nextDouble();
		double meter = input.nextDouble();
		double feet = input.nextDouble();
		System.out.println(km + " km is " + kmtomiles(km) + " miles");
		System.out.println(miles + " miles is " + milestokm(miles) + " km");
		System.out.println(meter + " meter is " + metertofeet(meter) + " feet");
		System.out.println(feet + " feet is " + feettometer(feet) + " meter");
	}
}
import java.util.Scanner;

class windchill {
	public static double calculatewindchill(double temp, double windspeed){
		double windchill = 35.74 + 0.6215 * temp +(0.4275*temp-35.75)*Math.pow(windspeed, 0.16);
		return windchill;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temp = input.nextDouble();
		double windspeed = input.nextDouble();
		double windchill = calculatewindchill(temp, windspeed);
	System.out.println("The windchill temperature is: %.2f°F%n" + windchill);
	}
}
import java.util.Scanner;

class temperatureconversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celcius = input.nextDouble();
		double farenheitresult = (celcius*9/5)+32;
		System.out.println("The " + celcius + " celcius is " + farenheitresult + " fahrenheit");
	}
}
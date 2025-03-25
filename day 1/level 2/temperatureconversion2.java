import java.util.Scanner;

class temperatureconversion2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		double celciusresult = (fahrenheit-32)*5/9;
		System.out.println("The " + fahrenheit + " fahrenheit is " + celciusresult + " celsius");
	}
}
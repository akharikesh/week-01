import java.util.Scanner;

public class temperatureconverter {
	public static double fahrenheittocelsius(double f){
		return (f-32)*5/9;
	}
	public static double celsiustofahrenheit(double c){
		return (c*9/5)+32;
	}
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = input.nextInt();
		if (choice==1){
			double f = input.nextDouble();
			double c = fahrenheittocelsius(f);
			System.out.printf("tempeature in celsius is : %.2f\n", c);
		}else if (choice==2){
			double c = input.nextDouble();
			double f = celsiustofahrenheit(c);
			System.out.printf("tempeature in fahrenheit is : %.2f\n", f);
		}else{
			System.out.println("Invalid choice");
		}
	}
}
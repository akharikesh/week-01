import java.util.Scanner;

class unitconverter3 {
	public static double farhenheittocelsius(double farhenheit){
		return (farhenheit-32)*5/9;
	}
	public static double celsiustofarhenheit(double celsius){
		return (celsius*9/5)+32;
	}
	public static double poundstokg(double pounds){
		return pounds*0.453592;
	}
	public static double kgtopounds(double kg){
		return kg*2.20462;
	}
	public static double gallonstolitre(double gallons){
		return gallons*3.78541;
	}
	public static double litretogallons(double litre){
		return litre*0.264172;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double farhenheit = input.nextDouble();
		double celsius = input.nextDouble();
		double pounds = input.nextDouble();
		double kg = input.nextDouble();
		double gallons = input.nextDouble();
		double litre = input.nextDouble();
		System.out.println(farhenheit + " F is " + farhenheittocelsius(farhenheit) + " celsius");
		System.out.println(celsius + " celsius is " + celsiustofarhenheit(celsius) + " F");
		System.out.println(pounds + " pounds is " + poundstokg(pounds) + " kg");
		System.out.println(kg + " kg is " + kgtopounds(kg) + " pounds");
		System.out.println(gallons + " gallons is " + gallonstolitre(gallons) + " litre");
		System.out.println(litre + " litre is " + litretogallons(litre) + " gallons");
	}
}
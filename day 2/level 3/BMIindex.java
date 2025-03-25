import java.util.Scanner;

class BMIindex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height =  input.nextDouble();
		double weight = input.nextDouble();
		double bmi = weight/(height*height*0.0001);
		if (bmi>=40){
			System.out.println("obese");
		}else if (bmi>=25){
			System.out.println("overweight");
		}else if (bmi>=18.5){
			System.out.println("normal");
		}else {
			System.out.println("underweight");
		}
		input.close();
	}
}
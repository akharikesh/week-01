import java.util.Scanner;

class bmicheck {
	public static void calculatebmi(double[][] data){
		for (int i=0;i<data.length;i++){
			double weight = data[i][0];
			double height = data[i][1]*0.01;
			data[i][2] = weight/(height*height);
		}
	}
	public static String[] bmistatus(double[][] data){
		String[] status = new String[data.length];
		for (int i=0;i<data.length;i++){
			double bmi = data[i][2];
			if (bmi<18.5){
				status[i] = "Underweight";
			}else if(bmi>=18.5&&bmi<=24.9){
				status[i] = "Normal";
			}else if (bmi>=25&&bmi<=39.9){
				status[i] = "Overweight";
			}else{
				status[i] = "Obese";
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];
		for (int i=0;i<10;i++){
			data[i][0]= input.nextDouble();
			data[i][1]= input.nextDouble();
		}
		calculatebmi(data);
		String[] status = bmistatus(data);
		System.out.println("Weight (kg)\tHeight (cm)\tBMI\t status");
		for (int i=0;i<10;i++){
			System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n", data[i][0], data[i][1], data[i][2], status);
		}
	}
}
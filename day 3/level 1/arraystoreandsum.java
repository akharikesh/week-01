import java.util.Scanner;

class arraystoreandsum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num =  new double[10];
		double total = 0.0;
		int index = 0;
		while (true){
			double number = input.nextDouble();
			if(number<=0 || index==10){
				break;
			}
			num[index] = number;
			index++;
		}
		for (int i=0;i<index;i++){
			System.out.println(num[i]);
			total+=num[i];
		}
		System.out.println("Total sum " + total);
		input.close();
	}
}
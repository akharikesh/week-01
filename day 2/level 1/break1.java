import java.util.Scanner;

class break1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total =0.0;
		while(true){
			double num = input.nextDouble();
			if(num<=0){
				break;
			}
				total+=num;
		}
		System.out.println(total);
		input.close();
	}
}
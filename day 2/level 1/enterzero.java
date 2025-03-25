import java.util.Scanner;

class enterzero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total =0.0;
		double num = input.nextDouble();
		while(num!=0){
			total+=num;
			num = input.nextDouble();
		}
		System.out.println(total);
		input.close();
	}
}
		
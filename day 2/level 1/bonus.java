import java.util.Scanner;

class bonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yearofservice =  input.nextInt();
		double salary = input.nextDouble();
	if (yearofservice>5){
		double bonus = salary*0.05;
		System.out.println(bonus + " is the bonus amount.");
	}else{
		System.out.println("not eligible for bonus");
	}
	input.close();
	}
}
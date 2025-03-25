import java.util.Scanner;

class pound {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		double pound = 2.2*weight;
		System.out.println("The weight of the person in pound is " + pound + " and in kg is " + weight);
	}
}

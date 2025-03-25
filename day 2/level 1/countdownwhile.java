import java.util.Scanner;

class countdownwhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = input.nextInt();
		while(counter>=1){
			System.out.println(counter);
			counter--;
		}
		System.out.println("Rocket has launched");
		input.close();
	}
}
		
			
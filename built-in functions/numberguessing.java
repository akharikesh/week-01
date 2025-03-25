import java.util.Scanner;
import java.util.Random;

class numberguessing {
	public static int generteguess (int low, int high){
		Random random = new Random();
		return random.nextInt(high-low+1)+low;
	}
	public static String userfeedback (Scanner input, int guess){
		System.out.println("Is your number " + guess + "? (Enter 'low', 'high' or 'correct')");
		return input.next().toLowerCase();
	}
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int low = 1;
		int high =100;
		boolean found =false;
		while (!found && low<=high){
			int guess = generteguess(low, high);
			String feedback  = userfeedback(input, guess);
			switch (feedback){
				case "low" : 
				            low = guess + 1;
				            break;
				case "high" : 
				            high = guess - 1;
				            break;
				case "correct" : 
				            System.out.println("Its a correct guess: " + guess);
							found = true;
							break;
				default :
				        System.out.println("Invalid input");
			}
		}
	}
}	
				                
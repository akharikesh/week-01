import java.util.Scanner;

class springseason {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int day = input.nextInt();
		boolean spring = (month == 3 && day >= 20 && day <= 31)||(month == 4 && day >=1 && day <=30)||(month == 5 && day >=1 && day <=31)||(month == 6 && day >=1 && day <=20);
		if(spring){
			System.out.println("Its a spring season");
		} else {
			System.out.println("Not a spring season");
		}
		input.close();
	}
}
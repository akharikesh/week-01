import java.util.Scanner;

class springseason {
	public static boolean isspringseason(int month, int day){
		return (month==3&&day==20)||(month==4)||(month==5)||(month==6&&day==20);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int day = input.nextInt();
		if (isspringseason(month, day)){
			System.out.println("Its a spring season");
		}else{
			System.out.println("Not a spring season");
		}
	}
}
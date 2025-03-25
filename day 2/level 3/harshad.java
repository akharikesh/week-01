import java.util.Scanner;

class harshad {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int sum =0;
		int number = num;
		while (number!=0){
			sum+=number%10;
			number/=10;
		}
		if (num%sum==0){
			System.out.println("Harshad number");
		}else {
			System.out.println("Not a Harshad number");
		}
		input.close();
	}
}
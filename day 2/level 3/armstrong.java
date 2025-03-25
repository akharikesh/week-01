import java.util.Scanner;

class armstrong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int sum =0;
		int number=num;
		while(number!=0){
			int digit=number%10;
			sum+=Math.pow(digit,3);
			number/=10;
		}
		if(sum==num){
			System.out.println(num + " is armstrong");
		}else{
			System.out.println(num + " is not armstrong");
		}
		input.close();
	}
}
			
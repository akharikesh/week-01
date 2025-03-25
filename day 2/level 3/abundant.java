import java.util.Scanner;

class abundant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int sum = 0;
			for (int i=1;i<num;i++){
				if (num%i==0){
					sum+=i;
				}
			}
			if (sum>num){
				System.out.println("Abundant number");
			}else {
				System.out.println("Not an Abundant number");
			}
			input.close();
	}
}
				
			
					
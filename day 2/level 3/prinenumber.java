import java.util.Scanner;

class prinenumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		boolean isPrime = true;
		if(num>1){
			for (int i=2;i<num;i++){
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
		}else{
			isPrime=false;
		}
		if(isPrime){
			System.out.println(num + " is prime");
		}else{
			System.out.println(num + " is not prime");
		}
		input.close();
	}
}
			
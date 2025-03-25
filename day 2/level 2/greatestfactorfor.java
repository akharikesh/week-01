import java.util.Scanner;

class greatestfactorfor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int greatest = 1;
		if (num>0){
			for (int i=num-1;i>0;i--){
				if (num%i==0){
					greatest=i;
					
					break;
				}
			}System.out.println(greatest);
		}else{
			System.out.println("invalid number");
		}
		input.close();
	}
}
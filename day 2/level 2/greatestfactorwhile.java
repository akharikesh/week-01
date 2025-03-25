import java.util.Scanner;

class greatestfactorwhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int greatest = 1;
		if (num>0){
			int counter = num -1;
			while (counter>0){
				if(num%counter==0){
					greatest=counter;
					break;
				}
				counter--;
			}System.out.println(greatest);
		}else{
			System.out.println("invalid number");
		}
		input.close();
	}
}
import java.util.Scanner;

class powerwhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int power = input.nextInt();
		if (num>0){
			int result=1;
			int counter=0;
			while(counter<power){
				result*=num;
				counter++;
			}
			System.out.println(result);
		}else{
			System.out.println("invalid");
		}
		input.close();
	}
}

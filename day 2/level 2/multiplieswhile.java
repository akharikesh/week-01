import java.util.Scanner;

class multiplieswhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		if (num>0&&num<100){
			int counter = 100;
		while (counter>1){
				if (counter%num==0){
					System.out.println(counter);
				}counter--;
			}
		}else{
			System.out.println("Invalid");
		}
		input.close();
	}
}
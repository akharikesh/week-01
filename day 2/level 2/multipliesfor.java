import java.util.Scanner;

class multipliesfor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		if (num>0&&num<100){
			for (int i=100;i>0;i--){
				if (i%num==0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Invalid");
		}
		input.close();
	}
}
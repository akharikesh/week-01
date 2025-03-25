import java.util.Scanner;

class checking {
	public static int check(int num){
		if (num>0){
			return 1;
		}else if (num<0){
			return -1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = check(num);
		if (result==1){
			System.out.println("The number is positive");
		}else if(result==-1){
			System.out.println("The number is negative");
		}else{
			System.out.println("The number is zero");
		}
	}
}
		
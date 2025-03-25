import java.util.Scanner;

class evenpositive {
	public static boolean ispositive(int num){
		return num>=0;
	}
	public static boolean iseven(int num){
		return num%2==0;
	}
	public static int compare(int num1, int num2){
		if (num1>num2){
			return 1;
		}else if(num1==num2){
			return 0;
		}else{
			return -1;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0;i<5;i++){
			num[i]=input.nextInt();
		}
		for (int i=0;i<5;i++){
			if (ispositive(num[i])){
				System.out.println("number " + num[i] + " is positive and");
				System.out.println(iseven(num[i]) ? " even " : " odd ");
			}else{
				System.out.println("number " + num[i] + " is negative");
			}
		}
        int result = compare(num[0], num[4]);
		if (result==1){
			System.out.println("first number is greater than last number");
		}else if(result==0){
			System.out.println("first and last number is equal");
		}else{
			System.out.println("last number is greater than first number");
		}
	}
}
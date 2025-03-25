import java.util.Scanner;

public class arraychecking {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		for (int i=0;i < num.length;i++){
			num[i] = input.nextInt();
		}
		for (int number : num){
			if (number>0){
				if (number%2==0){
					System.out.println("The number " + number + " is positive and even");
				}else{
					System.out.println("The number " + number + " is positive and odd");
				}
			}else if (number<0){
				System.out.println("The number " + number + " is negative");
			}else{
				System.out.println("The number is zero");
			}
		}
		int first = num[0];
		int last = num[num.length-1];
		if (first>last){
			System.out.println("The first number is greater than last number");
		}else if (first<last){
			System.out.println("The last number is greater than first number");
		}else {
			System.out.println("The first and last number are equal");
		}
		input.close();
	}
}
				
					
				
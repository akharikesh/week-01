import java.util.Scanner;

class arrayreverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp=num, count=0;
		while (temp>0){
			count++;
			temp/=10;
		}
		int[] digits = new int[count];
		int index=0;
		while (num>0){
			digits[index++]=num%10;
			num/=10;
		}
		for (int i=0;i<count;i++){
			System.out.println(digits[i]);
		}
		System.out.println();
	}
}

			
			
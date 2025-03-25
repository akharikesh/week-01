import java.util.Scanner;

class arraydigits2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxdigit = 10;
		int num = input.nextInt();
		int[] digits = new int[maxdigit];
		int index=0;
		while (num!=0) {
			if (index==maxdigit){
				maxdigit+=10;
				int[] temp = new int[maxdigit];
				System.arraycopy(digits, 0, temp, 0, index);
				digits=temp;
			}
			digits[index++]=num%10;
			num/=10;
		}
		int largest=-1, second=-1;
		for (int i=0;i<index;i++){
		if (digits[i]>largest){
			second=largest;
			largest=digits[i];
		}else if (digits[i]>second && digits[i]!=largest){
			second=digits[i];
		}
		}
		System.out.println("The largest number is " + largest);
		if (second!=-1){
		System.out.println("The second largest number is " + second);
		}else{
			System.out.println("no second largest  number");
		}
	}
}
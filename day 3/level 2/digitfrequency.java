import java.util.Scanner;

class digitfrequency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp=num, count=0;
		while (temp>0){
			count++;
			temp/=10;
		}
		int[] digits = new int[count];
		int[]  frequency = new int[10];
		temp=num;
		for (int i=0;i<count;i++){
			digits[i]=temp%10;
			frequency[digits[i]]++;
			temp/=10;
		}
		for(int i=0;i<10;i++){
			if(frequency[i]>0){
				System.out.println("digits " + i + " : " + frequency[i]);
			}
		}
	}
}
import java.util.Scanner;

class arraymultiplicationtable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int[] number = new int[10];
		for(int i=0;i<number.length;i++){
			number[i] = num * (i+1);
		}
		for(int i=0;i<number.length;i++){
			System.out.println(num + " * " + (i+1) + " = " + number[i]);
		}
		input.close();
	}
} 
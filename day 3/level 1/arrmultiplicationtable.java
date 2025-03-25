import java.util.Scanner;

class arrmultiplicationtable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int[] result = new int[4];
		for(int i=0;i<4;i++){
			result[i] = num * (i+6);
		}
		for(int i=0;i<4;i++){
			System.out.println(num + " * " + (i+6) + " = " + result[i]);
		}
		input.close();
	}
} 
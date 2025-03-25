import java.util.Scanner;

public class fibonacci {
	public static void generateseries(int num){
		int a=0, b=1;
		for (int i=1;i<num;i++){
			System.out.print(a + " ");
			int next =a+b;
			a=b;
			b=next;
		}
		System.out.println();
	}
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num<=0){
			System.out.println("Enter positive number");
		}else {
			generateseries(num);
		}
	}
}
			
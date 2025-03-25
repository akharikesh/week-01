import java.util.Scanner;

class noofchocolates {
	public static int[] chocochild (int num1, int num2){
		int chocolatesperchild =num1/num2;
		int remaining =num1%num2;
		return new int[]{chocolatesperchild, remaining};
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int chocolates = input.nextInt();
		int children = input.nextInt();
		int[] result = chocochild(chocolates, children);
		System.out.println("The number of chocolates each child gets is " + result[0]);
		System.out.println("The number of remaining chocolates is " + result[1]);
	}
}
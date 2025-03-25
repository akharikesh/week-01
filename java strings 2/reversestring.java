import java.util.Scanner;

class reversestring {
	public static String stringreverse(String str){
		String reverse = "";
		for (int i=str.length()-1;i>=0;i--){
			reverse += str.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String reversed = stringreverse(str);
		System.out.println("reverse : " + reversed);
	}
}
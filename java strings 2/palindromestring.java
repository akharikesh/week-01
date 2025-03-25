import java.util.Scanner;

class palindromestring {
	public static boolean ispalindrome(String str){
		int length = str.length();
		for (int i=0;i<length/2;i++){
			if (str.charAt(i)!=str.charAt(length-1-i)){
				return false;
				}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if (ispalindrome(str)){
			System.out.println("The String is palindrome");
		}else{
			System.out.println("The String not palindrome");
		}
	}
}
import java.util.Scanner;

class palindrome {
	String str;
	
	palindrome(String str){
		this.str = str;
	}
	boolean ispalindrome(){
		int left =0;
		int right = str.length()-1;
		while (left<right){
			if (str.charAt(left)!=str.charAt(right)){
				return false;
			}
            left++;
			right--;
		}
		return true;
	}
	void displayresult (){
		if (ispalindrome()){
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
			
		}
	}
}
public class palindromecheck {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		String inputtext = input.nextLine();
		palindrome check = new palindrome(inputtext);
		check.displayresult();
	}
}
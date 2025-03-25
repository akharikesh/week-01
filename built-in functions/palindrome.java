import java.util.Scanner;

public class palindrome {
	public static String getinput(){
		Scanner input = new Scanner(System.in);
		String word =  input.nextLine();
		return word;
	}
	public static boolean ispalindrome(String str){
		str = str.replaceAll("\\s+", "").toLowerCase();
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
	public static void displayresult (String word, boolean result){
		if (result){
			System.out.println(word + " is palindrome");
		}else {
			System.out.println(word + " is not palindrome");
			
		}
	}
	public static void main (String[] args){
		String word = getinput();
		boolean result = ispalindrome(word);
		displayresult(word, result);
	}
}
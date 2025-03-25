import java.util.Scanner;
import java.util.Arrays;

class anagrams {
	public static boolean comparestrings(String str1, String str2){
		if (str1.length()!=str2.length()){
		return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		if (comparestrings(str1, str2)){
			System.out.println("The two strings are anagrams");
		}else {
			System.out.println("The two strings are not anagrams");
		}
	}
}
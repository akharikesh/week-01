import java.util.Scanner;

class charstringarray {
	public static boolean comparestrings (String str1, String str2){
		if (str1.length()!=str2.length()){
			return false;
		}
		for (int i=0;i<str1.length();i++){
			if (str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static char[] getcharecters(String str){
		char[] characters = new char[str.length()];
		for (int i=0;i<str.length();i++){
			characters[i] = str.charAt(i);
		}
		return characters;
	}
	public static boolean comparechararray (char[] arr1, char[] arr2){
		if (arr1.length!=arr2.length){
			return false;
		}
		for (int i=0;i<arr1.length;i++){
			if (arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] chararraymethod = getcharecters(str);
		char[] builtinmethodd = str.toCharArray();
		for (char c : chararraymethod){
			System.out.println(c + " ");
		}
		System.out.println();
		for (char c : builtinmethodd){
			System.out.println(c + " ");
		}
		System.out.println();
		boolean comparisonresult = comparechararray(chararraymethod, builtinmethodd);
		System.out.println("comparison result " + comparisonresult);
	}
}
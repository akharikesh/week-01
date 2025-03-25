import java.util.Scanner;

class compare2strings {
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
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		boolean resultcharat = comparestrings(str1, str2);
		boolean resultequals = str1.equals(str2);
		System.out.println("comparison using charAt is " + resultcharat);
		System.out.println("comparison using equals() is " + resultequals);
		if (resultcharat==resultequals){
			System.out.println("both methods give same result");
		}else{
			System.out.println("mismatch in both results");
		}
	}
}
		
			
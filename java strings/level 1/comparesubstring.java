import java.util.Scanner;

class comparesubstring {
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
	public static String comparesubstring(String str, int start, int end){
		StringBuilder substring = new StringBuilder();
		for (int i=start;i<end;i++){
		substring.append(str.charAt(i));
		}
		return substring.toString();
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int start =input.nextInt();
		int end = input.nextInt();
		String resultcharat = comparesubstring(str, start, end);
		String resultbuitin = str.substring(start, end);
		System.out.println("substring using charAt is " + resultcharat);
		System.out.println("substring using is builtin" + resultbuitin);
		boolean comparisonresult = comparestrings(resultcharat, resultbuitin);
		System.out.println("comparison result " + comparisonresult);
	}
}
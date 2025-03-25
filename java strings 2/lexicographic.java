import java.util.Scanner;

class lexicographic {
	public static int comparestrings(String str1, String str2){
		int length = Math.min(str1.length(), str2.length());
		for (int i=0;i<length;i++){
			if (str1.charAt(i)!=str2.charAt(i)){
				return str1.charAt(i)-str2.charAt(i);
			}
		}
		return str1.length()-str2.length();
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		int result = comparestrings(str1, str2);
		if (result<0){
			System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
		}else if (result>0) {
			System.out.println(str1 + " comes after + " + str2 + " in lexicographical order");
		}else {
			System.out.println("both strings are equal");
		}
	}
}
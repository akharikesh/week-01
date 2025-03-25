import java.util.Scanner;

class removespecifichar {
	public static String removechar(String str, char ch){
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()){
			if (c!=ch){
				result.append(c);
			}
		}
		return result.toString();
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char toremove = input.next().charAt(0);
		String result = removechar(str, toremove);
		System.out.println("modified string : " + result);
	}
}
import java.util.Scanner;

class vowelsconsonants {
	public static int countvowels(String str){
		int count=0;
		String vowels = "AEIOUaeiou";
		for (int i=0;i<str.length();i++){
			if (vowels.indexOf(str.charAt(i))!=-1){
				count++;
			}
		}
		return count;
	}
	public static int countconsonants(String str){
		int count=0;
		String vowels = "AEIOUaeiou";
		for (int i=0;i<str.length();i++){
				char c = str.charAt(i);
				if (Character.isLetter(c) && vowels.indexOf(c)==-1){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int vowels = countvowels(str);
		int consonants = countconsonants(str);
		System.out.println("number of vowels are " + vowels);
		System.out.println("number of consonants are " + consonants);
	}
}
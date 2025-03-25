import java.util.Scanner;

class frequentchar {
	public static char mostfrequent(String str){
		int[] charcount = new int[256];
		for (char c : str.toCharArray()){
			charcount[c]++;
		}
		int maxcount = 0;
		char mostfrequentchar = ' ';
		for (char c : str.toCharArray()){
			if (charcount[c]>maxcount){
				maxcount = charcount[c];
				mostfrequentchar = c;
			}
		}
		return mostfrequentchar;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char result = mostfrequent(input);
		System.out.println("most frequent character : " + result);
	}
}
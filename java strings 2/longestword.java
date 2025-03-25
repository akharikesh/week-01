import java.util.Scanner;

class longestword {
	public static String findlongest(String sentence){
		String[] words = sentence.split(" ");
		String longest = "";
		for (String word : words){
			if (word.length()>longest.length()){
				longest = word;
			}
		}
		return longest;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String longestwo = findlongest(sentence);
		System.out.println("The longest word in the sentence is " + longestwo);
	}
}
import java.util.Scanner;

class youngtall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amarage =  input.nextInt();
		int akbarage =  input.nextInt();
		int antonyage =  input.nextInt();
		int amarheight =  input.nextInt();
		int akbarheight =  input.nextInt();
		int antonyheight =  input.nextInt();
		int youngestage = Math.min(amarage, Math.min(akbarage, antonyage));
		String youngest = (youngestage==amarage) ? "Amar" : (youngestage==akbarage) ? "Akbar" : "Antony";
		int tallestheight = Math.max(amarheight, Math.max(akbarheight, antonyheight));
		String tallest = (tallestheight==amarheight) ? "Amar" : (tallestheight==akbarheight) ? "Akbar" : "Antony";
		System.out.println(youngest);
		System.out.println(tallest);
		input.close();
	}
}
import java.util.Scanner;

class handshakes {
	public static int handshakes (int num){
		return ((num*(num-1))/2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int combinations= handshakes(num);
		System.out.println("The number of possible handshakes : " + combinations);
	}
}
		
import java.util.Scanner;

class factors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		if (num>0){
			for (int i=1;i<num;i++){
				if (num%i==0){
					System.out.println(i);
				}
			}System.out.println("are the factors");
		}else{
			System.out.println("invalid number");
		}
		input.close();
	}
}
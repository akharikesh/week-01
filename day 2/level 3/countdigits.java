import java.util.Scanner;

class countdigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int count =0;
		if (num!=0){
			while (num!=0){
				num/=10;
				count++;
			}
		}else{
			count=1;
		}
		System.out.println(count);
		input.close();
	}
}
				
import java.util.Scanner;

class oddevenarray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num>0){
			int[] evenarray = new int[num/2+1];
			int[] oddarray =new int[num/2+1];
			int evenindex=0, oddindex=0;
			for (int i=1;i<num;i++){
				if (i%2==0){
					evenarray[evenindex++]=i;
				}else {
					oddarray[oddindex++]=i;
				}
			}
			for (int i=0;i<evenindex;i++){
				System.out.println(evenarray[i] + " ");
			}
			System.out.println();
			for (int i=0;i<oddindex;i++){
				System.out.println(oddarray[i] + " ");
			}
			System.out.println();
			
		}else{
		System.out.println("error");
	}
	}
}
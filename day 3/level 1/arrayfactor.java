import java.util.Scanner;

class arrayfactor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num>0){
		int maxfactor =10;
		int[] factors = new int[maxfactor];
		int index=0;
		for (int i=0;i<=num;i++){
			if (i!=0&&num%i==0){
				if (index==maxfactor){
					maxfactor*=2;
					int[] temp = new int[maxfactor];
					for (int j=0;j<index;j++){
						temp[j]=factors[j];
					}
					factors=temp;
				}
				factors[index++]=i;
			}
		}
		System.out.println(num);
		for (int i=0;i<index;i++){
			System.out.print(factors[i] + " ");
		}
		System.out.println();
		}else{
			System.out.println("Invalid input");
		}
		input.close();
	}
}
					
					
				
				
import java.util.Scanner;
import java.util.Arrays;

class sumfactors {
	public static int[] countof(int num){
		int count=0;
		for (int i=1;i<=num;i++){
			if (num%i==0){
				count++;
			}
		}
		int[] factors =new int[count];
		int index=0;
		for( int i=1;i<=num;i++){
			if(num%i==0){
			factors[index++]=i;
			}
		}
		return factors;
	}
	public static int sumofnumbers(int[] factors){
		int sum=0;
		for(int factor : factors){
			sum+=factor;
		}
		return sum;
	}
	public static int productofnumbers(int[] factors){
		int product=1;
		for(int factor : factors){
			product*=factor;
		}
		return product;
	}
	public static int squareofnumbers(int[] factors){
		int sum=0;
		for(int factor : factors){
			sum+=Math.pow(factor, 2);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num<=0){
			System.out.println("enter a positive integer");
			return;
		}
		int[] factors = countof(num);
		int sum = sumofnumbers(factors);
		int product = productofnumbers(factors);
		int square = squareofnumbers(factors);
		System.out.println("factors: " + Arrays.toString(factors));
		System.out.println("sum of factors: " + sum);
		System.out.println("product of factors: " + product);
		System.out.println("sum of square of factors: " + square);
	}
}
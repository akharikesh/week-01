import java.util.Scanner;

class arrayfizzbuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		if (num>0){
			String[] results = new String[num +1];
			for (int i=1;i<=num;i++){
				if (i%3==0&&i%5==0){
					results[i]= "FizzBuzz";
				}else if(i%3==0){
					results[i]="Fizz";
				}else if (i%5==0){
					results[i]="Buzz";
				}else{
					results[i]=String.valueOf(i);
				}
		    }
			for (int i=0;i<=num;i++){
				System.out.println(results[i]);
			}
			
		}else{
			System.out.println("invalid");
		}
		input.close();
	}
}
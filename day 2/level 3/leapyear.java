import java.util.Scanner;

class leapyear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year =  input.nextInt();
		if(year>1582){
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						System.out.println(year + " is a leap year");
					}else{
						System.out.println(year + " is not a leap year");
					}
				}else{
					System.out.println(year + " is a leap year");
				}
			}else{
			System.out.println(year + " is a not leap year");
			}
		}else{
			System.out.println("The program only works for year greater than 1582");
		}
		input.close();
	}
}
		
						
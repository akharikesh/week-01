import java.util.Scanner;

class leapyear {
	public static boolean isleapyear(int year){
		return (year%4==0&&year%100!=0)||(year%400==0);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if (year>=1582){
			boolean isleap = isleapyear(year);
			System.out.println("Year " + year + " is " + (isleap ? "a Leap Year." : "not a Leap Year."));
		}else{
			System.out.println("The year should be greater than 1582");
		}
	}
}
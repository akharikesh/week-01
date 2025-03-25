import java.util.Scanner;

class calender {
	public static int daysofmonth (int year, int month){
		int[] days ={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2&&isleapyear(year)){
			return 29;
		}
		return days[month];
	}
	public static boolean isleapyear(int year){
		return (year%4==0&&year%100!=0)||(year%400==0);
	}
	public static int startday (int year, int month){
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		return (1+x+(31*m0)/12)%7;
	}
	public static void printcalender (int year, int month){
		String[] months ={",", "January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December"};
		System.out.println("\n " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int startDay = startday(year, month);
		int daysinmonth = daysofmonth(year, month);
		for (int i=0;i<startDay;i++){
			System.out.print("    ");
		}
		for (int day=1;day<daysinmonth;day++){
			System.out.printf("%3d ", day);
			if ((day +startDay)%7==0){
				System.out.println();
			}
		}
		System.out.println();
	}
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int year = input.nextInt();
		if (month<1 || month>12 || year<1582){
			System.out.println("Invalid year or month");
		}else{
			printcalender(year, month);
		}
	}
}
		
		
	
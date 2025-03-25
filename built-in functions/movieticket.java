import java.util.Scanner;

class Movie {
	String moviename;
	String seatno;
	double price;
	
	public void bookticket (String moviename, String seatno, double price){
		this.moviename = moviename;
		this.seatno= seatno;
		this.price= price;
		System.out.println("Successfully Booked");
	}
	void displaytickets(){
		System.out.println("Movie Name : " + moviename);
		System.out.println("Seat Number : " + seatno);
		System.out.println("Price : " + price);
	}
}
public class movieticket {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		String movie = input.nextLine();
		String seat = input.nextLine();
		double price = input.nextDouble();
		Movie ticket = new Movie();
		ticket.bookticket(movie, seat, price);
		ticket.displaytickets();
	}
}
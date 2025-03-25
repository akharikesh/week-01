import java.util.Scanner;

class calculatorswitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first =  input.nextInt();
		int second = input.nextInt();
		double result;
		String op = input.next();
		switch(op){
			case "+" :
			          result=first+second;
					  System.out.println("Result: " + result);
					  break;
			case "-" :
			          result=first-second;
					  System.out.println("Result: " + result);
					  break;
			case "*" :
			          result=first*second;
					  System.out.println("Result: " + result);
					  break;
			case "/" :
			          if (second!=0){
						  result=first/second;
						  System.out.println("Result: " + result);
					  }else { 
					  System.out.println("denominator cannot be zero");
					  }
					  break;
			default :
			         System.out.println("Invalid operator");
		}
		input.close();
	}
}
					  
			
			     
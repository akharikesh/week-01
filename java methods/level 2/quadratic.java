import java.util.Scanner;

class quadratic {
	public static double[] squareroot(double a, double b, double c){
		double delta = Math.pow(b, 2)-4*a*c;
		if (delta>0){
			double root1 = (-b+Math.sqrt(delta)/(2*a));
			double root2 = (-b-Math.sqrt(delta)/(2*a));
			return new double[]{root1, root2};
		}else if (delta==0){
			double root = -b/(2*a);
			return new double[]{root};
		}else{
			return new double[]{};
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double[] roots = squareroot(a,b,c);
		if (roots.length==2){
			System.out.printf("The root of the equation are: %.2f and %.2f%n ", roots[0], roots[1]);
		}else if(roots.length==1){
			System.out.printf("The root of the equation is: %.2f%n ", roots[0]);
		}else{
			System.out.println("No real roots");
		}
		
	}
}
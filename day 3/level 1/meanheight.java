import java.util.Scanner;

class meanheight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] heights =  new double[11];
		double total = 0.0;
		for (int i=0; i<heights.length;i++){
			heights[i] = input.nextDouble();
			total+=heights[i];
		}
		double meanheight = total/heights.length;
		System.out.println("The mean height of the football taem is " + meanheight);
		input.close();
	}
}
		
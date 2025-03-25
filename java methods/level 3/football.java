import java.util.Random;

class football {
	public static int calculatesum(int[] heights){
		int sum=0;
		for (int height : heights){
			sum+=height;
		}
		return sum;
	}
	public static double calculatemean (int[] heights){
		return (double) calculatesum(heights)/heights.length;
	}
	public static int isshortest (int[] heights){
		int shortest =heights[0];
		for (int height : heights){
			if (height<shortest){
				shortest=height;
			}
		}
		return shortest;
	}
	public static int istallest (int[] heights){
		int tallest = heights[0];
		for  (int height : heights){
			if (height>tallest){
				tallest=height;
			}
		}
		return tallest;
	}
	public static void main(String[] args){
		Random random = new Random();
		int[] heights = new int[11];
		for (int i=0;i<heights.length;i++){
			heights[i]=150 + random.nextInt(101);
		}
		int shortest = isshortest(heights);
		int tallest = istallest(heights);
		double mean = calculatemean(heights);
		System.out.println("The shortest player is: " + shortest + " cm");
		System.out.println("The tallest player is: " + tallest + " cm");
		System.out.printf("The mean height is: %.2f cm\n", mean);
	}
}	
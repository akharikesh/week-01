import java.util.Scanner;

class youngtall {
	public static String isyoungest(String[] names, int[] ages){
		int minage = ages[0];
		String youngest = names[0];
		for (int i=0;i<ages.length;i++){
			if (ages[i]<minage){
			minage = ages[i];
			youngest = names[i];
			}
		}
		return youngest;
	}
	public static String istallest(String[] names, double[] height){
		double maxheight = height[0];
		String tallest = names[0];
		for (int i=0;i<height.length;i++){
			if (height[i]>maxheight){
			maxheight = height[i];
			tallest = names[i];
			}
		}
		return tallest;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = {"Amar", "Akbar", "Antony"};
		int[] ages = new int[3];
		double[] height = new double[3];
		for(int i=0;i<3;i++){
			ages[i]=input.nextInt();
			height[i]=input.nextDouble();
		}
		String youngest = isyoungest(names, ages);
		String tallest = istallest(names, height);
		
		System.out.println("The youngest friend is " + youngest);
		System.out.println("The tallest friend is " + tallest);
	}
}
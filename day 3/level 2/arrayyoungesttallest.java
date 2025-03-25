import java.util.Scanner;

class arrayyoungesttallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
		for (int i=0;i<3;i++){
			ages[i]= input.nextInt();
			heights[i]= input.nextInt();
		}
		int minage = ages[0];
		String youngest = names[0];
		for (int i=0;i<3;i++){
			if (ages[i]<minage){
			minage = ages[i];
			youngest = names[i];
			}
		}
		int maxheight = heights[0];
		String tallest = names[0];
		for (int i=0;i<3;i++){
			if(heights[i]>maxheight){
				maxheight = heights[i];
				tallest = names[i];
			}
		}
		System.out.println("The youngest friend is: " + youngest + " and the age is " + minage);
		System.out.println("The tallest friend is: " + tallest + " and the height is " + maxheight);
	}
}
		
import java.util.Scanner;

class multidimensionalarray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int cols = input.nextInt();
		int[][] matrix = new int[rows][cols];
		for (int i=0;i<rows;i++){
			for (int j=0;j<cols;j++){
				matrix[i][j]= input.nextInt();
			}
		}
		int[] arr  = new int[rows*cols];
		int index =0;
		for (int i=0;i<rows;i++){
			for (int j=0;j<cols;j++){
				arr[index++]=matrix[i][j];
			}
		}
		for (int i=0;i<index;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
		
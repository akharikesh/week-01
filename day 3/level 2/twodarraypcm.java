import java.util.Scanner;

class twodarraypcm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][] data = new int[num][3];
		double[] percentage = new double[num];
		char[] grade = new char[num];
		for (int i=0;i<num;i++){
			data[i][0]=input.nextInt();
			while (data[i][0]<0){
				data[i][0]=input.nextInt();
			}
			data[i][1]=input.nextInt();
			while (data[i][1]<0){
				data[i][1]=input.nextInt();
			}
			data[i][2]=input.nextInt();
			while (data[i][2]<0){
				data[i][2]=input.nextInt();
			}
		}
		for (int i=0;i<num;i++){
			percentage[i] = (data[i][0]+data[i][1]+data[i][2])/3;
			
		if (percentage[i]>=80){
			grade[i]='A';
		}else if (percentage[i]>=70){
			grade[i]='B';
		}else if (percentage[i]>=60){
			grade[i]='C';
		}else if (percentage[i]>=50){
			grade[i]='D';
		}else if (percentage[i]>=40){
			grade[i]='E';
		}else{
			grade[i]='R';
			}
		}
		System.out.println("\nStudent Physics Chemistry Maths Percentage Grade");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d        %d      %d       %d    %.2f%%     %c\n", (i + 1), data[i][0], data[i][1], data[i][2], percentage[i], grade[i]);
        }
	}
}
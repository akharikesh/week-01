import java.util.Scanner;

class arraypcm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] physics =  new int[num];
		int[] chemistry = new int[num];
		int[] maths = new int[num];
		double[] percentage = new double[num];
		char[] grade = new char[num];
		for (int i=0;i<num;i++){
			physics[i]=input.nextInt();
			while (physics[i]<0){
				physics[i]=input.nextInt();
			}
			chemistry[i]=input.nextInt();
			while (chemistry[i]<0){
				chemistry[i]=input.nextInt();
			}
			maths[i]=input.nextInt();
			while (maths[i]<0){
				maths[i]=input.nextInt();
			}
		}
		for (int i=0;i<num;i++){
			percentage[i] = (physics[i]+chemistry[i]+maths[i])/3;
			
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
            System.out.printf("%d        %d      %d       %d    %.2f%%     %c\n", (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
	}
}
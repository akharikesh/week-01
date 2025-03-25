import java.util.Scanner;

class twodarraybmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double[][] persondata = new double[num][3];
		String[] status = new String[num];
		for (int i=0;i<num;i++){
			persondata[i][0] = input.nextDouble();
			while (persondata[i][0]<=0){
				persondata[i][0] = input.nextDouble();
			}
			persondata[i][1] = input.nextDouble();
			while (persondata[i][1]<=0){
				persondata[i][1] = input.nextDouble();
			}
		}
		for (int i=0;i<num;i++){
			persondata[i][2] =persondata[i][1]/(persondata[i][0]*persondata[i][0]*0.0001);
			if (persondata[i][2]>=40){
				status[i] = "obese";
			}else if (persondata[i][2]>=25){
				status[i] = "overweight";
			}else if (persondata[i][2]>=18.5){
				status[i] = "normal";
			}else {
				status[i] = "underweight";
			}
		}
		System.out.println("\nPerson	Height(m)	Weight(kg)	BMI	Status");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d	%.2f		%.2f		%.2f	%s\n", (i + 1), persondata[i][0], persondata[i][1], persondata[i][2], status[i]);
        }
	}
}
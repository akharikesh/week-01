import java.util.Scanner;

class arraybmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double[] height = new double[num];
		double[] weight = new double[num];
		double[] bmis = new double[num];
		String[] status = new String[num];
		for (int i=0;i<num;i++){
			height[i] = input.nextDouble();
			weight[i] = input.nextDouble();
		}
		for (int i=0;i<num;i++){
			bmis[i] =weight[i]/(height[i]*height[i]*0.0001);
			if (bmis[i]>=40){
				status[i] = "obese";
			}else if (bmis[i]>=25){
				status[i] = "overweight";
			}else if (bmis[i]>=18.5){
				status[i] = "normal";
			}else {
				status[i] = "underweight";
			}
		}
		System.out.println("\nPerson	Height(m)	Weight(kg)	BMI	Status");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d	%.2f		%.2f		%.2f	%s\n", (i + 1), height[i], weight[i], bmis[i], status[i]);
        }
	}
}
			
		
			
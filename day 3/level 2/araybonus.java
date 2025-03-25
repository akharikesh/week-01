import java.util.Scanner;

class araybonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int num =  10;
		double[] yearofservice = new double[num];
		double[] salary = new double[num];
		double[] bonus = new double[num];
		double[] newsalary = new double[num];
		double totbonus=0;
		double totsalary=0;
		double totnewsalary=0;
		for (int i=0;i<num;i++){
			while (true){
				salary[i] = input.nextDouble();
				yearofservice[i] = input.nextDouble();
				if (salary[i]>0 && yearofservice[i]>=0){
					break;
				}else{
					System.out.println("Invalid Input");
					
				}
			}
		}
		for (int i=0;i<num;i++){
			if (yearofservice[i]>5){
				bonus[i]=salary[i]*0.05;
			}else{
				bonus[i]=salary[i]*0.02;
			}
			newsalary[i]=salary[i]+bonus[i];
			totbonus+=bonus[i];
			totsalary+=salary[i];
			totnewsalary+=newsalary[i];
		}
		for (int i=0;i<num;i++){
			System.out.println("Employee " + (i + 1) + " - Old Salary: " + salary[i] + ", Bonus: " + bonus[i] + ", New Salary: " + newsalary[i]);
		}
		System.out.println(totbonus);
		System.out.println(totsalary);
		System.out.println(totnewsalary);
	input.close();
	}
}

import java.util.Scanner;

public class arrrayages {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ages = new int[10];
		for (int i=0;i < ages.length;i++){
			ages[i] = input.nextInt();
		}
		for (int i=0;i < ages.length;i++){
		int age = ages[i];
			if ( age>=18){
				System.out.println("The student with the age " + age + " can vote");
			}else if (age<18){
				System.out.println("The student with the age " + age + " cannot vote");
			}else {
				System.out.println("Invalid age");
			}
		}
		input.close();
	}
}
				
				
			
import java.util.Scanner;

class voting {
	public static boolean studentvote(int age){
		if (age < 0){
			return false;
		}
		return age>=18;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] studentage = new int[10];
		for (int i=0;i<10;i++){
			studentage[i]=input.nextInt();
			boolean vote = studentvote(studentage[i]);
			System.out.println("Student " + (i+1) + (vote ? " can vote " : " cannot vote"));
		}
			
	}
}
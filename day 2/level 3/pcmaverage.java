import java.util.Scanner;

class pcmaverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int physics =  input.nextInt();
		int chemistry = input.nextInt();
		int maths = input.nextInt();
		double average = (physics+chemistry+maths)/3;
		String grade, remarks;
		if (average>=80){
			grade="A";
			remarks="Level 4, above agency-normalized standerds";
		}else if (average>=70){
			grade="B";
			remarks="Level 3, at agency-normalized standerds";
		}else if (average>=60){
			grade="C";
			remarks="Level 2, below, but approaching agency-normalized standerds";
		}else if (average>=50){
			grade="D";
			remarks="Level 1, well below agency-normalized standerds";
		}else if (average>=40){
			grade="E";
			remarks="Level 1-, too below agency-normalized standerds";
		}else{
			grade="R";
			remarks="Remedial standerds";
		}
		System.out.println("The averageis " + average);
		System.out.println("The grade is " + grade);
		System.out.println(remarks);
		input.close();
	}
}
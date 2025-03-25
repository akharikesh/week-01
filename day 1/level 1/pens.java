class pens {
	public static void main(String[] args) {
		int tpens = 14;
		int students = 3;
		int penperstudent = tpens/students;
		int rempens =tpens%students;
		System.out.println("The Pen Per Student is " + penperstudent + " and the remaining pen not distributed is " + rempens);
	}
}
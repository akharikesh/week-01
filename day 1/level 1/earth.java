class earth {
	public static void main(String[] args) {
		int radius = 6378;
		double kmtomile = 0.621371;
		double volume = (4/3)*Math.PI*Math.pow(radius,3);
		double volumiles =volume*Math.pow(kmtomile,3);
		System.out.println("The volume of earth in cubic kilometers is " + volume  + " and the cubic miles is " + volumiles);
	}
}
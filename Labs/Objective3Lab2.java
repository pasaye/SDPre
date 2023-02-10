public class Objective3Lab2 {
	public static void main(String[] args) {
		double side1, side2, hypotenuse;
		side1 = 5;
		side2 = 6;
		hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
		String sent1 = "The hypotenuse of a triangle with sides ";
		String sent2 = " and ";
		String sent3 = " is ";
		System.out.println(sent1 + side1 + sent2 + side2 + sent3 + hypotenuse);

	}

}
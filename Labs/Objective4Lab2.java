import java.util.Scanner;

public	class Objective4Lab2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int num1; 
		int num2;
		int num3;

		double dub1;
		double dub2;
		double dub3;

		System.out.println("Please enter first whole number to add.");
		num1 = keyboard.nextInt();

		System.out.println("Please enter second whole number to add.");
		num2 = keyboard.nextInt();

		System.out.println("Please enter third whole number to add.");
		num3 = keyboard.nextInt();

		//-----------------------------------------------------------

		System.out.println("Please enter first decimal number to add.");
		dub1 = keyboard.nextDouble();

		System.out.println("Please enter second decimal number to add.");
		dub2 = keyboard.nextDouble();

		System.out.println("Please enter third decimal number to add.");
		dub3 = keyboard.nextDouble();

		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
		System.out.println(dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));

		keyboard.close();
	}
}
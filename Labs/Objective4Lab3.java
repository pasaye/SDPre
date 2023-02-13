import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int age;
		int currentYear = 2023;

		
		System.out.println("How old are you?");
		age = input.nextInt();



		System.out.println("You were born in " + (currentYear - age));
		input.close();
	}
}
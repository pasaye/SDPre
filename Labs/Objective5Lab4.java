import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int userNum;

		System.out.println("Please enter whole number");
		userNum = keyboard.nextInt();

		if( userNum % 2 == 0) {
			System.out.println("The number is positive :p");
		}
		else if(userNum % 2 != 0) {
			System.out.println("The number is negative :(");
		}

		keyboard.close();
	}
}
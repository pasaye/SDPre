import java.util.Scanner;

public class Objective9Lab5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

		System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();

    System.out.print("Please give me another number: ");
		num2 = kb.nextDouble();

		loop: while(keepGoing) {
			printMenu();
			System.out.println("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
				case 1:
      	answer = findSum(num1, num2);
      	System.out.println(num1 + " + " + num2 + " = " + answer);
      	break;
      case 2:
      	answer = findAverage(num1, num2);
      	System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
      	break;
      case 3:
      	answer = calcTax(num1, num2);
      	System.out.println("Taxes collected from a purchase of " + num1 + " and " + num2 + " is: " + answer);
      	break;
      case 4:
      	System.out.println("You've chosen to quit.");
      	break loop;
      default:
      	System.out.println("Ivalid entry. Please try again");
      	break;
			}
			
		}
			
	}
	public static void printMenu() {
			System.out.println();
			System.out.println("========= MENU =========");
			System.out.println("|                      |");
			System.out.println("|   1. Add Numbers     |");
			System.out.println("|   2. Find Average    |");
			System.out.println("|   3. Calculate Tax   |");
			System.out.println("|   4. Exit            |");
			System.out.println("|                      |");
			System.out.println("========================");
			System.out.println();
			}
			public static double findSum(double x, double y) {
			double sum = x + y;
			return sum;
		}
		  public static double findAverage(double x, double y) {
  		double sum = (x + y) / 2;
  		return sum;
  }
  		public static double calcTax(double x, double y) {
  		double sum = (8.31 / 100) * (x + y); 
  		return sum;
  	}
}

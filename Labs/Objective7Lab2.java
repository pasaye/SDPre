public class Objective7Lab2 {
	public static void main(String[] args) {
		int counter = 1;

		while(counter <= 20) {
			System.out.println(counter);
			counter = counter + 1;
			if(counter > 20) {
				System.out.println("Phew! Too tired to keep counting.");
			}
		}
	}
}
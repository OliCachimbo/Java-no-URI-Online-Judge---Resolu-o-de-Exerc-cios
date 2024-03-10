import java.util.Scanner;

public class Beecrowd1014 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int distanceTraveled = input.nextInt();
		float spentFuel = input.nextFloat();

		input.close();
		
		System.out.printf("%.3f km/l\n", distanceTraveled / spentFuel);
	}
}

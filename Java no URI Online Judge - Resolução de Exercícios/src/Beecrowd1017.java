import java.util.Scanner;

public class Beecrowd1017 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float spentTime = input.nextInt();
		float averageSpeed = input.nextInt();

		float fuelSpent = spentTime * averageSpeed / 12;

		System.out.printf("%.3f\n", fuelSpent);

		input.close();
	}
}

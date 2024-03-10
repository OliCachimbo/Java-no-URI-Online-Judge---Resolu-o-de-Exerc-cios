import java.util.Scanner;

public class Beecrowd1011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double volume = (4.0 / 3.0) * 3.14159 * Math.pow(radius, 3);

		System.out.printf("VOLUME = %.3f\n", volume);
		input.close();
	}

}

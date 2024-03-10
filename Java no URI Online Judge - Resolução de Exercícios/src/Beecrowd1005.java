import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double A, B, MEDIA;
		A = input.nextDouble();
		B = input.nextDouble();
		MEDIA = ((3.5d * A) + (7.5d * B)) / 11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		input.close();
	}
}

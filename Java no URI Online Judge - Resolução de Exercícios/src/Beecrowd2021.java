import java.util.Scanner;

public class Beecrowd2021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double informValue = input.nextDouble();

		int trueValue = 0;

		input.close();

		System.out.println("NOTAS:");

		trueValue = (int) (informValue / 100);
		System.out.printf("%d nota(s) de R$ 100.00\n", trueValue);

		trueValue = (int) trueValue % 50;
		System.out.printf("%d nota(s) de R$ 50.00\n", trueValue);

		trueValue = (int) trueValue % 20;
		System.out.printf("%d nota(s) de R$ 20.00\n", trueValue);

		trueValue = (int) trueValue % 10;
		System.out.printf("%d nota(s) de R$ 10.00\n", trueValue);

		trueValue = (int) trueValue % 5;
		System.out.printf("%d nota(s) de R$ 5.00\n", trueValue);

		trueValue = (int) trueValue % 2;
		System.out.printf("%d nota(s) de R$ 2.00\n", trueValue);
	}
}

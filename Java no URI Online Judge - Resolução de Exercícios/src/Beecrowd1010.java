import java.util.Scanner;

public class Beecrowd1010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int codeProduct1 = input.nextInt();
		int unitProduct1 = input.nextInt();
		float priceProduct1 = input.nextFloat();

		int codeProduct2 = input.nextInt();
		int unitProduct2 = input.nextInt();
		float priceProduct2 = input.nextFloat();

		input.close();

		float valuePay = (unitProduct1 * priceProduct1) + (unitProduct2 * priceProduct2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valuePay);

	}
}

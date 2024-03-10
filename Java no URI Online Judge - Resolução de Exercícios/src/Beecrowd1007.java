import java.util.Scanner;

public class Beecrowd1007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B, C, D, Difference;

		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();

		Difference = (A * B) - (C * D);
		System.out.println("DIFERENCA = " + Difference);

		input.close();
	}
}

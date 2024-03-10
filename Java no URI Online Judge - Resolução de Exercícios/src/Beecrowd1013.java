import java.util.Scanner;

public class Beecrowd1013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		input.close();

		int formulaG2 = (a + b + Math.abs(a - b)) / 2;
		int formulaG3 = (formulaG2 + c + Math.abs(formulaG2 - c)) / 2;
		System.out.println(formulaG3 + " eh o maior");

	}

}

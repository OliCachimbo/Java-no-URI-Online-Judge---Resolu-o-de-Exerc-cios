import java.util.Scanner;

public class Beecrowd1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int employeeNumber = input.nextInt();
		int workedHours = input.nextInt();
		float amountPerHour = input.nextFloat();
		float salary = workedHours * amountPerHour;

		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f\n", salary);

		input.close();
	}
}

import java.util.Scanner;

public class Beecrowd1020 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		input.close();

		int timeInYears = time / 365;

		int timeInMonths = (time % 365) / 30;

		int timeInDays = (time % 365) % 30;

		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", timeInYears, timeInMonths, timeInDays);
	}
}

import java.util.Scanner;

public class Beecrowd1019 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		input.close();

		int timeInHours = time / 3600;
		time = time % 3600;

		int timeInMinutes = time / 60;
		time = time % 60;

		int timeInSeconds = time % 3600;

		System.out.println(timeInHours + ":" + timeInMinutes + ":" + timeInSeconds);
	}
}
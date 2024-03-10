import java.util.Scanner;

public class Beecrowd1002{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double R, A;
		R = input.nextDouble();
		A = 3.14159*Math.pow(R, 2);
		System.out.printf("A=%.4f\n",A);
		input.close();
	}
}
import java.util.Scanner;

public class Beecrowd1009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String sallerName = input.nextLine();
		double fixedSalary = input.nextDouble();
		double saleTotal = input.nextDouble();
		
		double total = fixedSalary+(saleTotal*0.15f);
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		input.close();
	}
}

import java.util.Scanner;

public class Beecrowd1018 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int money = input.nextInt();

		input.close();

		System.out.println(money);

		System.out.println(money / 100 + " nota(s) de R$ 100,00");
		money = money % 100;
		
		System.out.println(money / 50 + " nota(s) de R$ 50,00");
		money = money % 50;
		
		System.out.println(money / 20 + " nota(s) de R$ 20,00");
		money = money % 20;
		
		System.out.println(money / 10 + " nota(s) de R$ 10,00");
		money = money % 10;
		
		System.out.println(money / 5 + " nota(s) de R$ 5,00");
		money = money % 5;
		
		System.out.println(money / 2 + " nota(s) de R$ 2,00");
		money = money % 2;
		
		System.out.println(money / 1 + " nota(s) de R$ 1,00");
		money = money % 1;
	}

}

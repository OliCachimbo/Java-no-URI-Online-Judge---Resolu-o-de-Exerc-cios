package ExerciseInComments;

import java.util.Scanner;
/*Me ajuda nesse 
Leia 
Pre�o do litro de combust�vel em reais;

Consumo m�dio do ve�culo em quil�metros por litro.

Dist�ncia da cidade onde o usu�rio se encontra e o seu destino em quil�metros.

Ap�s preencher os campos e clicar em um bot�o,
deve-se chamar uma fun��o em JavaScript que leia estes dados, 
calcule e apresente quantos reais ser�o gastos com a viagem...
no percurso de ida e volta
*/

public class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float pricePerLiter , kmPerLiter, distance, travelCost;
		pricePerLiter  = input.nextFloat();
		kmPerLiter  = input.nextFloat();
		distance = input.nextFloat();
		input.close();
		travelCost = distance/kmPerLiter*pricePerLiter*2;
		System.out.println(travelCost);
	}

}

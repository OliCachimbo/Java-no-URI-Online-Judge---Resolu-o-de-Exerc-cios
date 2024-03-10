package ExerciseInComments;

import java.util.Scanner;
/*Me ajuda nesse 
Leia 
Preço do litro de combustível em reais;

Consumo médio do veículo em quilômetros por litro.

Distância da cidade onde o usuário se encontra e o seu destino em quilômetros.

Após preencher os campos e clicar em um botão,
deve-se chamar uma função em JavaScript que leia estes dados, 
calcule e apresente quantos reais serão gastos com a viagem...
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

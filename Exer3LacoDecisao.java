package Lucas;

import java.util.Scanner;

/*Fa�a um programa que receba a idade de uma pessoa 
	 * e mostre na sa�da em qual categoria ela se encontra:	 
	10-14 infantil
	15-17 juvenil
	18-25 adulto*/

public class Exer3LacoDecisao {

	public static void main(String[] args) 
	{
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite a indade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("\n Infantil");
		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("\n Juvenil");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("\n Adulto");
		}
		else
		{
			System.out.println("\n Fora da faixa etaria necess�ria!");
		}
	}

}

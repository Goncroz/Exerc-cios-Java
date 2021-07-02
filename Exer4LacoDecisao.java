package Lucas;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer 
	 * e exiba se este número é par ou ímpar. 
	 * Se for par exiba também a raiz quadrada do mesmo; 
	 * se for ímpar exiba o número elevado ao quadrado.
	 */
public class Exer4LacoDecisao {

	public static void main(String[] args) 
	{
		float num;
		double res;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Entre com o número: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0)
		{
			res = Math.sqrt(num);
			System.out.println("\n O número é par e a raiz quadrada dele é: "+res);
		}
		else
		{
			res = Math.pow(num,2);
			System.out.println("\n O número é impar e o quadrado dele é: "+res);
		}

	}

}

package Lucas;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer 
	 * e exiba se este n�mero � par ou �mpar. 
	 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 * se for �mpar exiba o n�mero elevado ao quadrado.
	 */
public class Exer4LacoDecisao {

	public static void main(String[] args) 
	{
		float num;
		double res;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Entre com o n�mero: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0)
		{
			res = Math.sqrt(num);
			System.out.println("\n O n�mero � par e a raiz quadrada dele �: "+res);
		}
		else
		{
			res = Math.pow(num,2);
			System.out.println("\n O n�mero � impar e o quadrado dele �: "+res);
		}

	}

}

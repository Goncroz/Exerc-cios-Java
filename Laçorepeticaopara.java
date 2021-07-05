package Lucas;

import java.util.Scanner;

public class Laçorepeticaopara {

	public static void main(String[] args) 
	{
		float valor,soma=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=5;x++)
		{	
			
		System.out.println("\n Entre com um valor: ");
		valor = leia.nextFloat();

		
		soma = soma + valor;
		}
		
		System.out.println("\nO valor do somatório é: "+soma);
	}
	
	

	

}

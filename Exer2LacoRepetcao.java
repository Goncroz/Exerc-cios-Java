package Lucas;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class Exer2LacoRepetcao {

	public static void main(String[] args) 
	{
		float num,par=0,impar=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\n Entre com um número inteiro: ");
			num = leia.nextFloat();
			
			if(num%2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}		
		
		}
		System.out.println("\n "+par+" dos 10 números são pares!");
		System.out.println("\n "+impar+" dos 10 números são impares!");
		
	}

}

package Lucas;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class Exer2LacoRepetcao {

	public static void main(String[] args) 
	{
		float num,par=0,impar=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\n Entre com um n�mero inteiro: ");
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
		System.out.println("\n "+par+" dos 10 n�meros s�o pares!");
		System.out.println("\n "+impar+" dos 10 n�meros s�o impares!");
		
	}

}

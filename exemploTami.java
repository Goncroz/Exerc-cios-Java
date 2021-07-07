package Lucas;

import java.util.Scanner;

public class exemploTami 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

			int [] num= new int [6];
			int par=0, somaPar=0, impar=0, quantImpar=0,x;
			
			Scanner recebe = new Scanner(System.in);

			
			for (x=0;x<6;x++)
			{
				System.out.println("Digite um número: ");
				num[x]= recebe.nextInt();
				
			}
			
			 System.out.print("Os números pares são: ");
			 
			for (x=0; x<6; x++) 
			{
				
				if (num[x] % 2 == 0 && num[x] > 0 )
				{	
					
					System.out.print(num[x] + " " ); //PRINTANDO NA TELA TODOS VALORES PARES
					somaPar= somaPar + num[x]; // VALOR DA SOMA DOS NUMEROS PARES
				}
	
			   }
			
			 System.out.print("\nOs números ímpares são: ");

			 for (x=0;x<6;x++)
			 {
				 if (num[x] % 2 == 1 )
					{
					 	
						System.out.print(num[x] + " " ); //PRINTANDO NA TELA TODOS VALORES IMPARES
						quantImpar++; //QAUNTIDADE DE NUMEROS IMAPRES
					}
			 }	 
				 
	}
}	
				 


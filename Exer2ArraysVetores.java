package Lucas;

import java.util.Scanner;

public class Exer2ArraysVetores {
	 /*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		 � Os n�meros pares digitados;  
		 � A soma dos n�meros pares digitados; 
		 � Os n�meros �mpares digitados; 
		 � A quantidade de n�meros �mpares digitados.*/

	
	public static void main(String[] args) 
	{
		int[] num = new int[6];
		int x,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x = 0; x <= 5; x ++)
		{
			System.out.println("\n Digite um n�mero inteiro: ");
			num[x] = leia.nextInt();
		}
		
		System.out.print("Os n�meros pares s�o: ");
		
		for (x = 0; x <= 5; x++)

        {
            //System.out.println("\nOs n�meros foram: " + num[x]);
        
			if(num[x] % 2 == 0 && num[x] != 0)
			{
				somaPar = somaPar + num[x];
				System.out.print(num[x]+" ");
			}
        }
		
		System.out.print("\nOs n�meros impares s�o: ");
		
		for (x = 0; x <=5; x++)
		{
			if(num[x] % 2 ==1)
			{
				contImpar++;
				System.out.print(num[x]+" ");
			}
			
        }	
			
		
		System.out.println("\nA Soma dos n�meros pares: "+somaPar);
		System.out.println("\nA Quantidade de n�meros �impares: "+contImpar);
		
		
	}

}

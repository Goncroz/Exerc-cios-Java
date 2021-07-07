package Lucas;

import java.util.Scanner;

public class Exer2ArraysVetores {
	 /*Faça um programa que receba 6 números inteiros e mostre: 
		 • Os números pares digitados;  
		 • A soma dos números pares digitados; 
		 • Os números ímpares digitados; 
		 • A quantidade de números ímpares digitados.*/

	
	public static void main(String[] args) 
	{
		int[] num = new int[6];
		int x,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x = 0; x <= 5; x ++)
		{
			System.out.println("\n Digite um número inteiro: ");
			num[x] = leia.nextInt();
		}
		
		System.out.print("Os números pares são: ");
		
		for (x = 0; x <= 5; x++)

        {
            //System.out.println("\nOs números foram: " + num[x]);
        
			if(num[x] % 2 == 0 && num[x] != 0)
			{
				somaPar = somaPar + num[x];
				System.out.print(num[x]+" ");
			}
        }
		
		System.out.print("\nOs números impares são: ");
		
		for (x = 0; x <=5; x++)
		{
			if(num[x] % 2 ==1)
			{
				contImpar++;
				System.out.print(num[x]+" ");
			}
			
        }	
			
		
		System.out.println("\nA Soma dos números pares: "+somaPar);
		System.out.println("\nA Quantidade de números íimpares: "+contImpar);
		
		
	}

}

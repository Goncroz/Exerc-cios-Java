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
		for (x = 0; x <= 5; x++)

        {
            //System.out.println("\nOs números foram: " + num[x]);
        
			if(num[x] % 2 == 0)
			{
				//par = num[x];
				somaPar = somaPar + num[x];
				System.out.println("\n Número " +num[x]+ " digitado é par ");
			}
			else
			{
				//impar = num[x];
				contImpar++;
				System.out.println("\n Número " +num[x]+ " digitado é impar ");
			}
			
        }	
			
		/*for (x = 0; x < 5; x++)

        {
            System.out.println("\nOs números foram: " + num[x]);
        }*/
		//System.out.println("\n Os números pares foram: "+par);
		System.out.println("\n Soma dos números pares: "+somaPar);
		//System.out.println("\n Os números impares foram: "+impar);
		System.out.println("\n Quantidade de números íimpares: "+contImpar);
		//System.out.println("\n Número" +par+ "digitado é par ");
		//System.out.println("\n Número" +impar+ "digitado é impar ");
		
	}

}

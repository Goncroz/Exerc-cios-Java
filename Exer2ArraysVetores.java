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
		for (x = 0; x <= 5; x++)

        {
            //System.out.println("\nOs n�meros foram: " + num[x]);
        
			if(num[x] % 2 == 0)
			{
				//par = num[x];
				somaPar = somaPar + num[x];
				System.out.println("\n N�mero " +num[x]+ " digitado � par ");
			}
			else
			{
				//impar = num[x];
				contImpar++;
				System.out.println("\n N�mero " +num[x]+ " digitado � impar ");
			}
			
        }	
			
		/*for (x = 0; x < 5; x++)

        {
            System.out.println("\nOs n�meros foram: " + num[x]);
        }*/
		//System.out.println("\n Os n�meros pares foram: "+par);
		System.out.println("\n Soma dos n�meros pares: "+somaPar);
		//System.out.println("\n Os n�meros impares foram: "+impar);
		System.out.println("\n Quantidade de n�meros �impares: "+contImpar);
		//System.out.println("\n N�mero" +par+ "digitado � par ");
		//System.out.println("\n N�mero" +impar+ "digitado � impar ");
		
	}

}

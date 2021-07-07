package Lucas;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class Exer3ArraysMatrizes {

	public static void main(String[] args) 
	{
		int [][]matriz = new int [3][3];
		int linha,coluna,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha = 0; linha < 3; linha++)
		{
			for (coluna = 0; coluna <3; coluna++)
			{
				System.out.println("\n Entre com um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					maior++;
				}
				/*else
				{
				}*/
			}
		}
		System.out.println("\n "+maior+" números da matriz, são maiores que 10!");
		

	}

}

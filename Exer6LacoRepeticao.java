package Lucas;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
	 * Para sair digitar 0(zero).(DO...WHILE)*/
public class Exer6LacoRepeticao {

	public static void main(String[] args) 
	{
		int num,media,soma=0,cont=0,total=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\n Digite um n�mero inteiro: ");
			num = leia.nextInt();
			
			//System.out.println("\n"+num);
			
			if(num%3 == 0)
			{
				soma = soma + num;
				total = cont++;
			}
		}
		while (num !=0 );
		
		media = soma / total;
		
		System.out.println("\n"+media);
	
	}

}

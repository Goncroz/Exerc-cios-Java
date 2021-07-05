package Lucas;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: 
	 * Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. 
	 * O programa termina quando idade for =-99. (WHILE)*/

public class Exer3LacoRepeticao 
{

	public static void main(String[] args) 
	{
		int idade,x=0,y=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{			
			if(idade >0 && idade <=21)
			{
				x++;
			}
			else if(idade >=50)
			{
				y++;
			}
			
			System.out.println("\n Digite a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos são: "+x);
		System.out.println("\nTotal de pessoas com mais de 50 anos são: "+y);

	}

}

package Lucas;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class Exer1LacoDecisao {

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um n�mero inteiro: ");
		a = leia.nextInt();
		System.out.println("\nDigite um n�mero inteiro: ");
		b = leia.nextInt();
		System.out.println("\nDigite um n�mero inteiro: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("\n O maoir do n�mero �: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("\n O maior n�mero �: "+b);
		}
		else 
		{
			System.out.println("\n O maior n�mero �: "+c);
		}
		
	}

}

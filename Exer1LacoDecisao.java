package Lucas;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Exer1LacoDecisao {

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um número inteiro: ");
		a = leia.nextInt();
		System.out.println("\nDigite um número inteiro: ");
		b = leia.nextInt();
		System.out.println("\nDigite um número inteiro: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("\n O maoir do número é: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("\n O maior número é: "+b);
		}
		else 
		{
			System.out.println("\n O maior número é: "+c);
		}
		
	}

}

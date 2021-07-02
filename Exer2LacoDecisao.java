package Lucas;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.
public class Exer2LacoDecisao {

	public static void main(String[] args) 
	{
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Entre com um número: ");
		a = leia.nextFloat();
		System.out.println("\n Entre com um número: ");
		b = leia.nextFloat();
		System.out.println("\n Entre com um número: ");
		c = leia.nextFloat();
		
		if(a>b && b>c)
		{
			System.out.println("\n A ordem é: "+c+","+b+" e "+a);
		}
		else if(b>a && a>c)
		{
			System.out.println("\n A ordem é: "+c+","+a+" e "+b);
		}
		else if(c>a && a>b)
		{
			System.out.println("\n A ordem é: "+b+","+a+" e "+c);
		}
		else if(c>b && b>a)
		{
			System.out.println("\n A ordem é: "+a+","+b+" e "+c);
		}
		else if(a>c && c>b)
		{
			System.out.println("\n A ordem é: "+b+","+c+" e "+a);
		}	
		else
		{
			System.out.println("\n A ordem é: "+a+","+c+" e "+b);
		}	

	}

}

package Lucas;

import java.util.Scanner;

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
public class Exer2LacoDecisao {

	public static void main(String[] args) 
	{
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Entre com um n�mero: ");
		a = leia.nextFloat();
		System.out.println("\n Entre com um n�mero: ");
		b = leia.nextFloat();
		System.out.println("\n Entre com um n�mero: ");
		c = leia.nextFloat();
		
		if(a>b && b>c)
		{
			System.out.println("\n A ordem �: "+c+","+b+" e "+a);
		}
		else if(b>a && a>c)
		{
			System.out.println("\n A ordem �: "+c+","+a+" e "+b);
		}
		else if(c>a && a>b)
		{
			System.out.println("\n A ordem �: "+b+","+a+" e "+c);
		}
		else if(c>b && b>a)
		{
			System.out.println("\n A ordem �: "+a+","+b+" e "+c);
		}
		else if(a>c && c>b)
		{
			System.out.println("\n A ordem �: "+b+","+c+" e "+a);
		}	
		else
		{
			System.out.println("\n A ordem �: "+a+","+c+" e "+b);
		}	

	}

}

package Lucas;

import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */

public class Exer3Intro {

	public static void main(String[] args) 
	{
		int totalSeg,h,m,s;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o tempo de dura��o do evento: ");
		totalSeg = leia.nextInt();
		
		h = totalSeg/3600;
		m = (totalSeg%3600)/60;
		s = (totalSeg%3600)%60;
		
		System.out.println("\nO tempo de dura��o do evento foi de: "+h+" hora(s) "+m+" minuto(s) e "+s+" segundo(s)");

	}

}

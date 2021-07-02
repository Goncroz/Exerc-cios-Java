package Lucas;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */

public class Exer3Intro {

	public static void main(String[] args) 
	{
		int totalSeg,h,m,s;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o tempo de duração do evento: ");
		totalSeg = leia.nextInt();
		
		h = totalSeg/3600;
		m = (totalSeg%3600)/60;
		s = (totalSeg%3600)%60;
		
		System.out.println("\nO tempo de duração do evento foi de: "+h+" hora(s) "+m+" minuto(s) e "+s+" segundo(s)");

	}

}

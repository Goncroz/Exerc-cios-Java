package Lucas;

import java.util.Scanner;

public class Exer1Intro {

	public static void main(String[] args) 
	{
		int anos,meses,dias,totalD,totalAnos,totalMeses,totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a quantidade de anos: ");
		anos = leia.nextInt();
		System.out.println("\nEntre com a quantidade de meses: ");
		meses = leia.nextInt();
		System.out.println("\nEntrecom a quantidade de dias: ");
		dias = leia.nextInt();
		
		totalAnos = anos*365;
		totalMeses = meses*30;
		totalDias = dias;
		
		totalD = totalAnos + totalMeses + totalDias;
		
		System.out.println("\nEu já vivi "+totalD+" de dias de vida");
	}

}

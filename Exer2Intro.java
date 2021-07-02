package Lucas;

import java.util.Scanner;

public class Teste3 {
	public static void main(String[] args)
	{
		int totaldias,d,m,a;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o total de dias: ");
		totaldias = leia.nextInt();
		
		a = totaldias / 365;
		m = (totaldias % 365) / 30;
		d = (totaldias % 365) % 30;
		
		System.out.println("\nVocê viveu: "+a+" ano(s), "+m+" mes(es) e "+d+" dia(s) de vida...");
		
	}
}

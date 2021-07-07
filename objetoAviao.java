package Lucas;

public class objetoAviao 
{
	public static void main(String[]args)
	{
		
	Aviao infoGeral = new Aviao (123,"09:40 AM");
	Aviao infoVoo1 = new Aviao("Rayssa Santos","21");
	Aviao infoVoo2 = new Aviao("Jady Santos","24");
	Aviao infoVoo3 = new Aviao("Miguel Santos","07");
	
	infoGeral.imprimirInfoVoo();
	infoVoo1.imprimirInfoPassageiros();
	infoVoo2.imprimirInfoPassageiros();
	infoVoo3.imprimirInfoPassageiros();
	
	System.out.println("\n*** DEVIDO A FORTES CHUVAS O HORÁRIO DO VOO 123 COM DESTINO A RECIFE FOI ADIADO ***");
	System.out.println("\n*** FAVOR CHECAR O NOVO HORÁRIO DO VOO 123 COM DESTINO A RECIFE ***");
	System.out.println("\n*** FAVOR CHECAR O NOVO NÚMERO DA SUA POLTRONA ***");
	
	infoGeral.setHoraDoVoo("12:10 PM");
	infoVoo1.setNumPoltrona("42");
	infoVoo2.setNumPoltrona("48");
	infoVoo3.setNumPoltrona("14");
	
	
	infoGeral.imprimirInfoVoo();
	infoVoo1.imprimirInfoPassageiros();
	infoVoo2.imprimirInfoPassageiros();
	infoVoo3.imprimirInfoPassageiros();
	
	}
}

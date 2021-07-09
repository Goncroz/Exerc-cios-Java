package Lucas;

public class Teste {

	public static void main(String[] args) {
		Cachorro Tchala = new Cachorro ("TChala", 7 ,"Rodrigo","Ração Premium",1);
		Cavalo Corsel = new Cavalo ("Corsel" , 2 , "Rosana","Capim Fresco", 3,4);
		Preguica Flexa = new Preguica ("Flexa",20,"Maykon","Folhas Frescas",400);
		
		Tchala.imprimirCachorro();
		Corsel.imprimirCavalo();
		Flexa.imprimirPreguica();

	}

}

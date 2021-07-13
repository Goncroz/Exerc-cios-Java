package Lucas;

public class Teste 
{

	public static void main(String[] args) 
	{
		Animal Cachorro = new Cachorro ("Tchala",3,"AU AU","correr");
		Animal Cavalo = new Cavalo ("Corsel",9,"Relincha", "correr");
		Animal Preguica = new Preguica ("Priscila",19,"Fi Fi", "sobe em árvores");
		
		Cachorro.movimento();
		Cachorro.som();
		
		System.out.println("___________________________________________________");
		
		Cavalo.movimento();
		Cavalo.som();
		
		System.out.println("___________________________________________________");
		
		Preguica.movimento();
		Preguica.som();
	}

}

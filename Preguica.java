package Lucas;

public class Preguica extends Animal
{
	private float gramas;
	
	public Preguica (String nome,int idade,String dono,String comida,float gramas)
	{
		super(nome,idade,dono,comida);
		this.gramas = gramas;
	}

	public float getGramas() {
		return gramas;
	}

	public void setGramas(float gramas) {
		this.gramas = gramas;
	}
	
	public void imprimirPreguica()
	{
		System.out.println("\nInforma��es da Pregui�a");
		System.out.println("\nNome da pregui�a: "+getNome());
		System.out.println("Idade da pregui�a: "+getIdade()+" anos");
		System.out.println("Nome do(a) dono(a): "+getDono());
		System.out.println("Alimenta��o da pregui�a: "+gramas+"g de "+getComida());
		System.out.println("\n*************************************************");
	}

	
}

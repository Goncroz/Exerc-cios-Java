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
		System.out.println("\nInformações da Preguiça");
		System.out.println("\nNome da preguiça: "+getNome());
		System.out.println("Idade da preguiça: "+getIdade()+" anos");
		System.out.println("Nome do(a) dono(a): "+getDono());
		System.out.println("Alimentação da preguiça: "+gramas+"g de "+getComida());
		System.out.println("\n*************************************************");
	}

	
}

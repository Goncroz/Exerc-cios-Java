package Lucas;

public class Cavalo extends Animal
{
	private float kg;
	private int ferraduras;
	
	public Cavalo (String nome,int idade,String dono,String comida,float kg,int ferraduras)
	{
		super(nome,idade,dono,comida);
		this.kg = kg;
		this.ferraduras = ferraduras;
	}

	public float getKg() {
		return kg;
	}

	public void setKg(float kg) {
		this.kg = kg;
	}
	

	public int getFerraduras() {
		return ferraduras;
	}

	public void setFerraduras(int ferraduras) {
		this.ferraduras = ferraduras;
	}

	public void imprimirCavalo()
	{
		System.out.println("\nInformações do Cavalo");
		System.out.println("\nNome do cavalo: "+getNome());
		System.out.println("Idade do cavalo: "+getIdade()+" anos");
		System.out.println("Nome do dono: "+getDono());
		System.out.println("Alimentação do cavalo: "+kg+"kg de "+getComida());
		System.out.println("Chegou com quantas ferraduras: "+ferraduras);
		System.out.println("\n*************************************************");
	}

	
}
	

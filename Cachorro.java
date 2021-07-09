package Lucas;

public class Cachorro extends Animal
{
	private float kg;


public Cachorro (String nome,int idade,String dono,String comida,float kg)
{
	super(nome,idade,dono,comida);
	this.kg = kg;
}




public float getKg() {
	return kg;
}




public void setKg(float kg) {
	this.kg = kg;
}




public void imprimirCachorro()
{
	System.out.println("\nInformações do Cachorro");
	System.out.println("\nNome do cachorro: "+getNome());
	System.out.println("Idade do cachorro: "+getIdade()+" anos");
	System.out.println("Nome do dono: "+getDono());
	System.out.println("Alimentação do cachorro: "+kg+"kg de "+getComida());
	System.out.println("\n*************************************************");
}
}

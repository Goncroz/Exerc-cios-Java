package Lucas;

public class Preguica extends Animal
{	
	public Preguica (String nome,int idade,String som,String movimento)
	{
		super(nome,idade,som,movimento);
	}
	@Override
	public void movimento()
	{
		System.out.println("\n A pregui�a "+getNome()+" tem "+getIdade()+" anos de idade e o movimento dele � "+getMovimento());
	}
	@Override
	public void som()
	{
		System.out.println("\nO som deste animal � "+getSom());
	}
	
}

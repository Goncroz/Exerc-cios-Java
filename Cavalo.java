package Lucas;

public class Cavalo extends Animal
{
	
	
	public Cavalo (String nome,int idade,String som,String movimento)
	{
		super(nome,idade,som,movimento);
		
	}
	@Override
	public void movimento()
	{
		System.out.println("\n O cavalo "+getNome()+" tem "+getIdade()+" anos idade e o movimento dele é "+getMovimento());
	}
	@Override
	public void som()
	{
		System.out.println("\n O som deste animal é "+getSom());
	}

	
}
	

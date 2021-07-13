package Lucas;

public class Cachorro extends Animal
{

public Cachorro (String nome,int idade,String som, String movimento)
{
	super(nome,idade,som,movimento);
}
@Override
public void movimento() 
{
	System.out.println("\n O cachorro "+getNome()+" tem "+getIdade()+" anos de idade e o movimento dele é "+getMovimento());
}
@Override
public void som()
{
	System.out.println("\n O som deste animal é "+getSom());
}

}

package Lucas;

public class Animal 
{
	private String nome;
	private int idade;
	private String dono;
	private String comida;
	
	
	public Animal (String nome,int idade,String dono, String comida)
	{
		super ();
		this.nome = nome;
		this.idade = idade;
		this.dono = dono;
		this.comida = comida ;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
	}


	public String getComida() {
		return comida;
	}


	public void setComida(String comida) {
		this.comida = comida;
	}


		
}

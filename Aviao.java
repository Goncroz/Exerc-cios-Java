package Lucas;

public class Aviao 
{
	private int numVoo;
	private String nomePassageiro;
	private String numPoltrona;
	private String horaDoVoo;
	
	public Aviao (int voo, String passageiro, String poltrona, String horaVoo)
	{
		this.numVoo = voo;
		this.nomePassageiro = passageiro;
		this.numPoltrona = poltrona;
		this.horaDoVoo = horaVoo;
	}
	public Aviao (int voo, String horaVoo)
	{
		this.numVoo = voo;
		this.horaDoVoo = horaVoo;
	}
	public Aviao (String passageiro, String poltrona)
	{
		this.nomePassageiro = passageiro;
		this.numPoltrona = poltrona;
	}
	public void imprimirInfoVoo()
	{
		System.out.println("\nO voo com destino a Recife de número: "+numVoo+" Está programado para as "+horaDoVoo);
		System.out.println("\nConfira abaixo seu nome e sua poltrona");
	}
	public void imprimirInfoPassageiros()
	{
	System.out.println("\nNome do Passageiro :"+nomePassageiro+"\nPoltrona de número :"+numPoltrona);
	}
	public int getNumVoo() {
		return numVoo;
	}
	public void setNumVoo(int numVoo) {
		this.numVoo = numVoo;
	}
	public String getNomePassageiro() {
		return nomePassageiro;
	}
	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}
	public String getNumPoltrona() {
		return numPoltrona;
	}
	public void setNumPoltrona(String numPoltrona) {
		this.numPoltrona = numPoltrona;
	}
	public String getHoraDoVoo() {
		return horaDoVoo;
	}
	public void setHoraDoVoo(String horaDoVoo) {
		this.horaDoVoo = horaDoVoo;
	}
	

}

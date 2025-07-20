package teste;


public class Socio extends Cliente {
	
	private int cpf;
	private Dependente dependente;
	
	
	public Socio(String nome, int data, int telefone, Endereco endereco, int cpf) {
		super(nome, data, telefone, endereco);
		this.cpf = cpf;

	}
	
	public void adicionarDependente(Dependente dep) {
		
		this.dependente=dep;
	}



	@Override
	public String toString() {
		return "Socio [cpf=" + cpf + ", dependente=" + dependente + "]";
	}
	
	

	
	
	
	
	

}

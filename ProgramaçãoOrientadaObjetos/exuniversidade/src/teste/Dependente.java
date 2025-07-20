package teste;

public class Dependente extends Cliente{

	public Dependente(String nome, int data, int telefone, Endereco endereco) {
		super(nome, data, telefone, endereco);
		
	}

	@Override
	public String toString() {
		return "Dependente []";
	}
	
	

}

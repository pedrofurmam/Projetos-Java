package teste;

public class Endereco {
	
	private int numero;
	private int cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	
	public Endereco(int numero, int cep, String rua, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.numero = numero;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}


	@Override
	public String toString() {
		return "Endereco [numero=" + numero + ", cep=" + cep + ", rua=" + rua + ", bairro=" + bairro + ", cidade="
				+ cidade + ", unidadeFederativa=" + unidadeFederativa + "]";
	}
	
	
	

}

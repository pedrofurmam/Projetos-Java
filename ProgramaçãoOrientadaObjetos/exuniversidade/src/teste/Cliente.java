package teste;

public abstract class Cliente {
	
	protected String nome;
	protected int data;
	protected int telefone;
	protected Endereco endereco;
	
	
	public Cliente(String nome, int data, int telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.data = data;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getCliente() {
		
		return nome + " - Nasc: " + data + ", Tel: " + telefone + ", End: " + endereco;
	}
	
	
	

}

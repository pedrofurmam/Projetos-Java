package teste;

public class Filme {
	private String titulo;
	private int duracao;
	private double preco;
	private double valorDia;
	private boolean disponivel;
	private int diaLocacao;
    private int diaPrevisto;
    private int diaDevolucao;
	private Cliente cliente;
	
	public Filme(String titulo, int duracao, double preco, double valorDia) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
		this.valorDia = valorDia;
		
		this.disponivel = true;
	}
	
	public boolean alocar(Cliente cliente, int dia) {
		
		if(disponivel ==  true) {
			this.disponivel = false;
			this.cliente=cliente;
			this.diaLocacao = dia;
			this.diaPrevisto=dia+3;
			
			System.out.println("Filme alugado com sucesso");
			return true;
		}
		
		else {
			
		System.out.println("Filme indisponivel");
		
		return false;
		}
	}
	
	public void devolver(int dia) {
		
		if(disponivel == true) {
			
			System.out.println("Filme nao alugado");
			return;
		}
		else {
			this.diaDevolucao=dia;
			double multa=valorDia*(dia-diaPrevisto);
			double total= multa + preco;
			
			if(dia<=diaPrevisto) {
				
				this.disponivel = true;
				System.out.println("Filme devolvido");
				System.out.println("----- RELATÓRIO DE DEVOLUÇÃO -----");
		        System.out.println("Filme: " + titulo);
		        System.out.println("Cliente: " + cliente.getCliente());
		        System.out.println("Dia da locação: " + diaLocacao);
		        System.out.println("Dia previsto de devolução: " + diaPrevisto);
		        System.out.println("Dia da devolução: " + diaDevolucao);
		        System.out.println("Valor do filme: R$ " + preco);
		       
		        System.out.println("----------------------------------");
				return;
			}
			else {
				
				this.disponivel = true;
				System.out.println("Filme devolvido");
				System.out.println("----- RELATÓRIO DE DEVOLUÇÃO -----");
		        System.out.println("Filme: " + titulo);
		        System.out.println("Cliente: " + cliente.getCliente());
		        System.out.println("Dia da locação: " + diaLocacao);
		        System.out.println("Dia previsto de devolução: " + diaPrevisto);
		        System.out.println("Dia da devolução: " + diaDevolucao);
		        System.out.println("Valor do filme: R$ " + preco);
		        System.out.println("Multa: R$ " + multa);
		        System.out.println("Total: R$ " + total);
		        System.out.println("----------------------------------");
			}
			
		}
		
			
	}
	
	
	public void exibirRelatorio() {
		
		System.out.println("----- RELATÓRIO DO FILME -----");
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Preço da locação: R$ " + preco);
        System.out.println("Multa por dia de atraso: R$ " + valorDia);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));

        if (!disponivel && cliente != null) {
            System.out.println("Locado por: " + cliente.getCliente());
        }
        System.out.println("-------------------------------");
		
		
	}
	

}

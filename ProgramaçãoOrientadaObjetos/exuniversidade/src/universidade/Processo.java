package examesuficiencia;

class Processo {
    private String numero;
    private String dataCriacao;
    private String descricao;

    public Processo(String numero, String dataCriacao, String descricao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Número: " + numero +
               ", Data de Criação: " + dataCriacao +
               ", Descrição: " + descricao;
    }
}

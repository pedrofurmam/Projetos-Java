package enumeracoes;

public class Cliente {
	
	private int codigo;
    private String nome;
    private String dataNascimento;
    private EstadoCivil estadoCivil;

    public Cliente(int codigo, String nome, String dataNascimento, EstadoCivil estadoCivil) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome= " + nome  +
                ", dataNascimento=" + dataNascimento  +
                ", estadoCivil=" + estadoCivil +
                '}';
    }

}

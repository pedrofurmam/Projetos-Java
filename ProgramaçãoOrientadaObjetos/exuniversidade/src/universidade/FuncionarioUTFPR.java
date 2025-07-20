package examesuficiencia;

abstract class FuncionarioUTFPR {
    protected String registro;
    protected String nome;
    protected String dataAdmissao;
    protected double salarioBase;

    public FuncionarioUTFPR(String registro, String nome, String dataAdmissao, double salarioBase) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    public abstract void exibirDados();
}

package heranca;

public abstract class Funcionario {
    protected String nome;
    protected String registro;
    protected double salarioBase;

    public Funcionario(String nome, String registro, double salarioBase) {
        this.nome = nome;
        this.registro = registro;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    public abstract void exibirDados();
}


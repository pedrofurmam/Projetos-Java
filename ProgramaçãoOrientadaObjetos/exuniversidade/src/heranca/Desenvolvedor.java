package heranca;

public class Desenvolvedor extends Funcionario {
    private int projetosConcluidos;
    private double bonificacaoPorProjeto;

    public Desenvolvedor(String nome, String registro, double salarioBase, int projetosConcluidos, double bonificacaoPorProjeto) {
        super(nome, registro, salarioBase);
        this.projetosConcluidos = projetosConcluidos;
        this.bonificacaoPorProjeto = bonificacaoPorProjeto;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (projetosConcluidos * bonificacaoPorProjeto);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Desenvolvedor ===");
        System.out.println("Nome: " + nome);
        System.out.println("Registro: " + registro);
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        System.out.println("Projetos Concluídos: " + projetosConcluidos);
        System.out.printf("Bonificação por Projeto: R$ %.2f\n", bonificacaoPorProjeto);
        System.out.printf("Salário Final: R$ %.2f\n", calcularSalario());
    }
}

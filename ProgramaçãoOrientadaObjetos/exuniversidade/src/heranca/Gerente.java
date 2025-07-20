package heranca;

public class Gerente extends Funcionario {
    private double lucroEmpresa;
    private double percentualParticipacao; // Exemplo: 0.01 para 1%

    public Gerente(String nome, String registro, double salarioBase, double lucroEmpresa, double percentualParticipacao) {
        super(nome, registro, salarioBase);
        this.lucroEmpresa = lucroEmpresa;
        this.percentualParticipacao = percentualParticipacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (lucroEmpresa * percentualParticipacao);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Gerente ===");
        System.out.println("Nome: " + nome);
        System.out.println("Registro: " + registro);
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        System.out.printf("Lucro da Empresa: R$ %.2f\n", lucroEmpresa);
        System.out.printf("Percentual de Participação: %.2f%%\n", percentualParticipacao * 100);
        System.out.printf("Salário Final: R$ %.2f\n", calcularSalario());
    }
}

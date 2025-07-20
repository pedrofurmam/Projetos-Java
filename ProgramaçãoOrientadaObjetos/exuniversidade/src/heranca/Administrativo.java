package heranca;

public class Administrativo extends Funcionario {
    private double adicional;

    public Administrativo(String nome, String registro, double salarioBase, double adicional) {
        super(nome, registro, salarioBase);
        this.adicional = adicional;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicional;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Funcionário Administrativo ===");
        System.out.println("Nome: " + nome);
        System.out.println("Registro: " + registro);
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        System.out.printf("Adicional: R$ %.2f\n", adicional);
        System.out.printf("Salário Final: R$ %.2f\n", calcularSalario());
    }
}

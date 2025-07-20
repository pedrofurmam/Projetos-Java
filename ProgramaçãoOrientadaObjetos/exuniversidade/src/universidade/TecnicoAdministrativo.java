package examesuficiencia;
import java.util.ArrayList;

class TecnicoAdministrativo extends FuncionarioUTFPR {
    private double adicionalNoturno;
    private ArrayList<Processo> processos;

    public TecnicoAdministrativo(String registro, String nome, String dataAdmissao, double salarioBase, double adicionalNoturno) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.adicionalNoturno = adicionalNoturno;
        this.processos = new ArrayList<>();
    }

    public void adicionarProcesso(Processo p) {
        processos.add(p);
    }

    public void removerProcesso(String numero) {
        processos.removeIf(p -> p.getNumero().equals(numero));
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicionalNoturno;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Técnico Administrativo ===");
        System.out.println("Registro: " + registro);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Adicional Noturno: R$" + adicionalNoturno);
        System.out.println("Salário Total: R$" + calcularSalario());
        System.out.println("Processos:");
        for (Processo p : processos) {
            System.out.println("  - " + p);
        }
    }
}

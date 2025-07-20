package examesuficiencia;

import java.util.ArrayList;


class Professor extends FuncionarioUTFPR {
    private Titulacao titulacao;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String registro, String nome, String dataAdmissao, double salarioBase, Titulacao titulacao) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.titulacao = titulacao;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public void removerDisciplina(String codigo) {
        disciplinas.removeIf(d -> d.getCodigo().equals(codigo));
    }

    @Override
    public double calcularSalario() {
        double gratificacao = (titulacao == Titulacao.MESTRE) ? 1000 : 2000;
        int totalHoras = 0;
        for (Disciplina d : disciplinas) {
            totalHoras += d.getCargaHoraria();
        }
        double adicionalHoras = totalHoras * 15;
        return salarioBase + gratificacao + adicionalHoras;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Professor ===");
        System.out.println("Registro: " + registro);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Disciplinas:");
        for (Disciplina d : disciplinas) {
            System.out.println("  - " + d);
        }
        System.out.println("Salário Total: R$" + calcularSalario());
    }
}
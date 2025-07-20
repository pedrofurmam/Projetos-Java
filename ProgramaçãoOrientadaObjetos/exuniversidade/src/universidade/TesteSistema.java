package examesuficiencia;

public class TesteSistema {
    public static void main(String[] args) {
        // Professor
        Professor prof = new Professor("P001", "Ana Silva", "01/03/2010", 5000, Titulacao.DOUTOR);
        prof.adicionarDisciplina(new Disciplina("D001", "POO", "Programação Orientada a Objetos", 60));
        prof.adicionarDisciplina(new Disciplina("D002", "BD", "Banco de Dados", 45));
        prof.exibirDados();

        System.out.println("\n--- Removendo disciplina BD ---\n");
        prof.removerDisciplina("D002");
        prof.exibirDados();

        System.out.println("\n-----------------------\n");

        // Técnico Administrativo
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("T001", "Carlos Souza", "15/05/2015", 3000, 500);
        tecnico.adicionarProcesso(new Processo("P001", "10/04/2024", "Processo de matrícula"));
        tecnico.adicionarProcesso(new Processo("P002", "20/04/2024", "Processo de compra"));
        tecnico.exibirDados();

        System.out.println("\n--- Removendo processo P002 ---\n");
        tecnico.removerProcesso("P002");
        tecnico.exibirDados();
    }
}

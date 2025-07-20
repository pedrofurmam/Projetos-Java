package teste;

public class LocadoraTeste {
	
	public static void main(String[] args) {
        Endereco end = new Endereco( 123,12345-678,"Rua das Flores","Centro", "CidadeX", "PR");
        Socio socio = new Socio("Carlos Silva", 1990, 999999999,end, 23342);
        Dependente dep = new Dependente("Joana Silva", 2005, 888888888, end);
        socio.adicionarDependente(dep);

        Filme filme = new Filme("Matrix", 136, 10, 2.0);

        filme.exibirRelatorio();

        filme.alocar(dep, 5);
        filme.exibirRelatorio();

        filme.devolver(9); // devolução com 1 dia de atraso

        filme.exibirRelatorio();
	}

}

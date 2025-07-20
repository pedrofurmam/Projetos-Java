package enumeracoes;

public class EmpresaTeste {
	public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Tech Solutions Ltda", "12.345.678/0001-90", UnidadeFederativa.SAO_PAULO);
        Empresa empresa2 = new Empresa("Construtora Sul", "98.765.432/0001-55", UnidadeFederativa.RIO_GRANDE_DO_SUL);

        System.out.println(empresa1);
        System.out.println(empresa2);
    }

}

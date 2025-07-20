package enumeracoes;

public class ClienteTeste {
	
public static void main(String[] args) {
	Cliente cliente1 = new Cliente(1, "Ana Silva", "1990-05-12", EstadoCivil.SOLTEIRO);
    Cliente cliente2 = new Cliente(2, "Carlos Souza", "1985-09-23", EstadoCivil.CASADO);

    System.out.println(cliente1);
    System.out.println(cliente2);
}

}

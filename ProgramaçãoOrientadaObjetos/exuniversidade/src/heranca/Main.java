package heranca;

public class Main {
    public static void main(String[] args) {
        Administrativo admin = new Administrativo("João", "A001", 3000.00, 500.00);
        Desenvolvedor dev = new Desenvolvedor("Maria", "D001", 10000.00, 2, 1500.00);
        Gerente gerente = new Gerente("Carlos", "G001", 10000.00, 500000.00, 0.01);

        System.out.println();
        admin.exibirDados();
        System.out.println();
        dev.exibirDados();
        System.out.println();
        gerente.exibirDados();
    }
}

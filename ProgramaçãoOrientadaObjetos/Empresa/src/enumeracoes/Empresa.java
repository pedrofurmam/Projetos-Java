package enumeracoes;

public class Empresa {
	
	private String razaoSocial;
    private String cnpj;
    private UnidadeFederativa unidadeFederativa;

    public Empresa(String razaoSocial, String cnpj, UnidadeFederativa unidadeFederativa) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", unidadeFederativa=" + unidadeFederativa.getNome() +
                " (" + unidadeFederativa.getSigla() + ", Capital: " + unidadeFederativa.getCapital() + ")" +
                '}';
    }

}

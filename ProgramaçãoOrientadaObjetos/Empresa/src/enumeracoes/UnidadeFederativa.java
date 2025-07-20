package enumeracoes;

public enum UnidadeFederativa {
	PARANA("Paraná", "PR", "Curitiba"),
    SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
    SAO_PAULO("São Paulo", "SP", "São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
    ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória");

    private String nome;
    private String sigla;
    private String capital;

    UnidadeFederativa(String nome, String sigla, String capital) {
        this.nome = nome;
        this.sigla = sigla;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCapital() {
        return capital;
    }

}

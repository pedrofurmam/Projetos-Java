package examesuficiencia;

class Disciplina {
    private String codigo;
    private String nome;
    private String ementa;
    private int cargaHoraria;

    public Disciplina(String codigo, String nome, String ementa, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               ", Nome: " + nome +
               ", Ementa: " + ementa +
               ", Carga Horária: " + cargaHoraria;
    }
}

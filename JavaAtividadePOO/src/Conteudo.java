import java.time.LocalDate;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String nome;
    private String descricao;
    private int cargaHoraria;
    LocalDate data;

    public Conteudo(String titulo, String descricao, int cargaHoraria) {
        this.nome = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    protected abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome;
    }

}
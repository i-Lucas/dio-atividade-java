public class Curso extends Conteudo {

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao, cargaHoraria);
    }

    @Override
    protected double calcularXp() {
        return super.getXpPadrao() * super.getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso: " + this.getNome();
    }
}
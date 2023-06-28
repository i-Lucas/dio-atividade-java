public class Mentoria extends Conteudo {

    public Mentoria(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao, cargaHoraria);
    }

    @Override
    protected double calcularXp() {
        return super.getXpPadrao() * super.getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Mentoria: " + this.getNome();
    }
}
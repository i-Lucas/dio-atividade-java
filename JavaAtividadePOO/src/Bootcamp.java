import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = this.dataInicial.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(this.getNome(), bootcamp.getNome())
                && Objects.equals(this.getDescricao(), bootcamp.getDescricao())
                && Objects.equals(this.getConteudos(), bootcamp.getConteudos())
                && Objects.equals(this.getDataFinal(), bootcamp.getDataFinal())
                && Objects.equals(this.getDevsInscritos(), bootcamp.getDevsInscritos());

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNome(), this.getConteudos(), this.getDescricao(), this.getDataInicial(),
                this.getDataFinal(), this.getDevsInscritos());
    }
}
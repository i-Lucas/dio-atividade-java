import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso("curso java", "descricao curso java", 8);
        Curso curso2 = new Curso("curso javascript", "descricao curso javascript", 4);

        curso1.setData(LocalDate.now());
        curso2.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria("mentoria java", "descrição mentoria java", 10);
        Mentoria mentoria2 = new Mentoria("mentoria javascript", "descrição mentoria javascript", 8);

        mentoria1.setData(LocalDate.now());
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("bootcamp java", "descrição bootcamp java");
        // bootcamp.getConteudos().add(curso1);
        // bootcamp.getConteudos().add(curso2);
        // bootcamp.getConteudos().add(mentoria1);
        // bootcamp.getConteudos().add(mentoria2);

        Set<Conteudo> conteudos = new LinkedHashSet<>();
        conteudos.add(curso1);
        conteudos.add(curso2);
        conteudos.add(mentoria1);
        conteudos.add(mentoria2);

        bootcamp.getConteudos().addAll(conteudos);
        System.out.println(bootcamp.getConteudos());

        Dev lucas = new Dev("Lucas");
        Dev rafa = new Dev("Rafa");

        System.out.println("lucas conteúdos: " + lucas.getConteudosIncritos());
        lucas.inscreverBootcamp(bootcamp);
        rafa.inscreverBootcamp(bootcamp);

        System.out.println("lucas conteúdos: " + lucas.getConteudosIncritos());
        System.out.println("lucas conteúdos: " + lucas.getConteudosConcluidos());

        lucas.progredir();

        System.out.println("lucas conteúdos: " + lucas.getConteudosIncritos());
        System.out.println("lucas conteúdos: " + lucas.getConteudosConcluidos());

        System.out.println("xp lucas: " + lucas.calcularTotalXp());
        System.out.println("xp rafa: " + rafa.calcularTotalXp());

        lucas.progredir();
        System.out.println("xp lucas: " + lucas.calcularTotalXp());

        lucas.progredir();
        lucas.progredir();
        System.out.println("xp lucas: " + lucas.calcularTotalXp());
        lucas.progredir();
    }
}
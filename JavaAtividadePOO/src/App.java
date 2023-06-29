import java.util.Set;
import java.time.LocalDate;
import java.util.LinkedHashSet;

import Dev.Dev;
import Course.Course;
import Content.Content;
import Bootcamp.Bootcamp;
import Mentoring.Mentoring;

public class App {
    public static void main(String[] args) throws Exception {

        Course curso1 = new Course("java course", "java course description", 8);
        Course curso2 = new Course("javascript course", "javascript course description", 4);

        curso1.setDate(LocalDate.now());
        curso2.setDate(LocalDate.now());

        Mentoring mentoria1 = new Mentoring("mentoring java", "java mentorship description", 10);
        Mentoring mentoria2 = new Mentoring("mentoring javascript", "javascript mentorship description", 8);

        mentoria1.setDate(LocalDate.now());
        mentoria2.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("bootcamp java", "java bootcamp description");

        Set<Content> conteudos = new LinkedHashSet<>();
        conteudos.add(curso1);
        conteudos.add(curso2);
        conteudos.add(mentoria1);
        conteudos.add(mentoria2);

        bootcamp.getContents().addAll(conteudos);
        System.out.println(bootcamp.getContents());

        Dev lucas = new Dev("Lucas");
        Dev rafa = new Dev("Rafa");

        System.out.println("lucas content: " + lucas.getSubscribedContent());
        lucas.enrollBootcamp(bootcamp);
        rafa.enrollBootcamp(bootcamp);

        System.out.println("lucas content: " + lucas.getSubscribedContent());
        System.out.println("lucas content: " + lucas.getFinishedContents());

        lucas.toProgress();

        System.out.println("lucas content: " + lucas.getSubscribedContent());
        System.out.println("lucas content: " + lucas.getFinishedContents());

        System.out.println("xp lucas: " + lucas.calculateTotalXp());
        System.out.println("xp rafa: " + rafa.calculateTotalXp());

        lucas.toProgress();
        System.out.println("xp lucas: " + lucas.calculateTotalXp());

        lucas.toProgress();
        lucas.toProgress();
        System.out.println("xp lucas: " + lucas.calculateTotalXp());
        lucas.toProgress();
    }
}
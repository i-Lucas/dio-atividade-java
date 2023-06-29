package Dev;

import Content.Content;
import Bootcamp.Bootcamp;

import java.util.Set;
import java.util.Objects;
import java.util.Optional;
import java.util.LinkedHashSet;

public class Dev {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public Dev(String nome) {
        this.name = nome;
    }

    public void enrollBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void toProgress() {

        Optional<Content> content = this.subscribedContent.stream().findFirst();

        if (content.isPresent()) {
            this.finishedContents.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("You are not subscribed to any content");
        }
    }

    public double calculateTotalXp() {
        return this.finishedContents.stream().mapToDouble(content -> content.calculateExperience()).sum();
    }

    public String getName() {
        return name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Dev dev = (Dev) obj;
        return Objects.equals(this.getName(), dev.getName())
                && Objects.equals(this.getSubscribedContent(), dev.getSubscribedContent())
                && Objects.equals(this.getFinishedContents(), dev.getFinishedContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSubscribedContent(), this.getFinishedContents());
    }

}
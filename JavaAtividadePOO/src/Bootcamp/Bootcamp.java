package Bootcamp;

import java.util.Set;
import java.util.Objects;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.LinkedHashSet;

import Dev.Dev;
import Content.Content;

public class Bootcamp {

    private String name;
    private String description;

    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = this.initialDate.plusDays(45);

    private Set<Dev> subscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.name = nome;
        this.description = descricao;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(this.getName(), bootcamp.getName())
                && Objects.equals(this.getDescription(), bootcamp.getDescription())
                && Objects.equals(this.getContents(), bootcamp.getContents())
                && Objects.equals(this.getFinalDate(), bootcamp.getFinalDate())
                && Objects.equals(this.getSubscribedDevs(), bootcamp.getSubscribedDevs());

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getContents(), this.getDescription(), this.getInitialDate(),
                this.getFinalDate(), this.getSubscribedDevs());
    }
}
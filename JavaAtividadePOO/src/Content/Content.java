package Content;
import java.time.LocalDate;

public abstract class Content {

    protected static final double STANDART_EXP = 10d;

    private String name;
    private String description;
    private int workload;
    LocalDate date;

    public Content(String name, String description, int workload) {
        this.name = name;
        this.description = description;
        this.workload = workload;
    }

    public abstract double calculateExperience();

    public static double getStandardExp() {
        return STANDART_EXP;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate data) {
        this.date = data;
    }

    @Override
    public String toString() {
        return "Curso: " + this.name;
    }

}
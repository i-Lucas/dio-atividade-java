package Mentoring;
import Content.Content;

public class Mentoring extends Content {

    public Mentoring(String title, String description, int workload) {
        super(title, description, workload);
    }

    @Override
    public double calculateExperience() {
        return super.getStandardExp() * super.getWorkload();
    }

    @Override
    public String toString() {
        return "Mentoring: " + this.getName();
    }
}
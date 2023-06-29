package Course;
import Content.Content;

public class Course extends Content {

    public Course(String title, String description, int workload) {
        super(title, description, workload);
    }

    @Override
    public double calculateExperience() {
        return super.getStandardExp() * super.getWorkload();
    }

    @Override
    public String toString() {
        return "Course: " + this.getName();
    }
}
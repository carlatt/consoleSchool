package school.model;

import java.time.LocalDateTime;

public class CourseEdition {
    private long id;
    private Course course;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double cost;
    private Instructor instructor;

    public CourseEdition(long id, Course course, LocalDateTime startDate, LocalDateTime endDate, double cost, Instructor instructor) {
        this.id = id;
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.instructor = instructor;
    }


    public long getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}

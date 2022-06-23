package school.model;

public class Course {
    private long id;
    private String title;
    private int hours;
    private Area area;
    private Level level;

    public Course(long id, String title, int hours, Area area, Level level) {
        this.id = id;
        this.title = title;
        this.hours = hours;
        this.area = area;
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public Area getArea() {
        return area;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString(){
        return "Title: "+this.getTitle()+", hours: "+this.getHours()+", area:"+this.getArea().name()+", level: "+this.getLevel().name()+" ";
    }

}

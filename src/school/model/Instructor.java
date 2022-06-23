package school.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class Instructor {
    private long id;
    private String name;
    private String surname;
    private LocalDateTime birthDate;
    private String mail;
    //TODO: handling methods for areas
    private ArrayList<Area> areas;

    public Instructor(long id, String name, String surname, LocalDateTime birthDate, String mail) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mail = mail;
        this.areas = new ArrayList<>();
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void addArea(Area area){
        this.areas.add(area);
    }

    public Collection<Area> getAllArea(){
        return this.areas;
    }
}

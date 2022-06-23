package school.data;

import school.model.Course;
import school.model.CourseEdition;
import school.model.Instructor;
import school.model.Level;
import school.model.Area;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class SchoolRepository {
    private HashMap<Course, ArrayList<CourseEdition>> courseEditions;
    private Collection<Instructor> instructors;


    public SchoolRepository() {
        // TODO: creare qualche oggetto

        this.courseEditions = new HashMap<>();
        this.instructors = new ArrayList<>();


    }

    //public void addCourse(Course course){
        //this.course.add(course);
    //}

    public Course searchCourseById(long id){
        for (Course course: this.courseEditions.keySet()){
            if (course.getId() == id){
                return course;
            }
        }
        return null;
    }

    public Collection<Course> searchCourseByString(String s){
        ArrayList<Course> coursesWithSubstring = new ArrayList<>();

        for (Course course: this.courseEditions.keySet()){
            if (course.getTitle().contains(s)){
                 coursesWithSubstring.add(course);
            }
        }
        return coursesWithSubstring;
    }

    public Collection<Course> getCourses(){
        return this.courseEditions.keySet();
    }

    public Collection<CourseEdition> getCourseEditionsById(long courseId){
        Course c = this.searchCourseById(courseId);
        return courseEditions.get(c);
    }

    public Collection<Instructor> getInstructorByAreaAndLevel(Area area, Level level){
        ArrayList<Instructor> instructors = new ArrayList<>();

        Collection<Course> Courses = this.courseEditions.keySet();
        for (Course c : Courses){

            if (c.getArea() == area & c.getLevel()== level){
                ArrayList<CourseEdition> editions = courseEditions.get(c);

                for (CourseEdition edition : editions){
                    Instructor instructor = edition.getInstructor();
                    instructors.add(instructor);
                }
            }
        }
        return instructors;
    }

    public Collection<Instructor> getInstructorsBornAfterDateAndSpecializedIn2Areas(LocalDateTime birthDate){
        ArrayList<Instructor> instructors1 = new ArrayList<>();
        for (Instructor i : this.instructors){
            if (i.getBirthDate().isAfter(birthDate) && (i.getAllArea().size()>=2)){
                instructors1.add(i);
            }
        }
        return instructors1;
    }

    public void addInstructor(Instructor i){
        this.instructors.add(i);
    }

    public void addInstructor2Edition(long id, CourseEdition edition){
        for (Instructor i : this.instructors){
            if(i.getId() == id){
                edition.setInstructor(i);
                return;
            }
        }
    }

}

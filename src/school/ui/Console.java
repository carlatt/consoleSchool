package school.ui;

import school.data.SchoolRepository;
import school.model.Course;

import java.util.Collection;
import java.util.Scanner;

public class Console {
    private static SchoolRepository repo = new SchoolRepository();
    public static void main(String[] args) {

        printAllCourses();

        /*
        System.out.println("Enter Input : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        scanner.close();

         */
    }

    public static void printAllCourses(){
        Collection<Course> courses = repo.getCourses();
        for (Course c: courses){
            System.out.println(c);
        }
    }
}

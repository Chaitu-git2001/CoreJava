import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        
        Set<String> registeredCourses = new LinkedHashSet<>();

        
        String[] courses = {"CS101", "MA101", "CS101", "DA101"};

        
        for (String course : courses) {
            if (!registeredCourses.add(course)) {
                System.out.println("Duplicate course ignored: " + course);
            }
        }

                System.out.println("Registered Courses: " + String.join(", ", registeredCourses));
    }
}

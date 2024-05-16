package Part2.T7;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> studentList;
    public Course(String title) {
        this.title = title;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Додаткові методи...
}

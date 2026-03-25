package repository;

import model.Student;
import java.util.HashMap;

public class StudentRepository {

    private HashMap<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.id, student);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public HashMap<String, Student> getAllStudents() {
        return students;
    }
}

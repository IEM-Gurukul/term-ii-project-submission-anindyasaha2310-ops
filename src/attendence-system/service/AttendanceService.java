package service;

import model.Student;
import repository.StudentRepository;
import exception.StudentNotFoundException;

public class AttendanceService {

    private static AttendanceService instance;
    private StudentRepository repo;

    private AttendanceService() {
        repo = new StudentRepository();
    }

    public static AttendanceService getInstance() {
        if (instance == null) {
            instance = new AttendanceService();
        }
        return instance;
    }

    public void addStudent(String name, String id) {
        repo.addStudent(new Student(name, id));
    }

    public void markAttendance(String id, boolean present) throws StudentNotFoundException {
        Student s = repo.getStudent(id);
        if (s == null) {
            throw new StudentNotFoundException("Student not found!");
        }
        s.markAttendance(present);
    }

    public void displayAll() {
        for (Student s : repo.getAllStudents().values()) {
            s.displayDetails();
        }
    }
}

package ui;

import service.AttendanceService;
import util.InputUtil;
import exception.StudentNotFoundException;

public class MainApp {

    public static void main(String[] args) {

        AttendanceService service = AttendanceService.getInstance();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Students");
            System.out.println("4. Exit");

            int choice = InputUtil.getInt("Enter choice: ");

            try {
                switch (choice) {
                    case 1:
                        String name = InputUtil.getString("Enter name: ");
                        String id = InputUtil.getString("Enter ID: ");
                        service.addStudent(name, id);
                        break;

                    case 2:
                        String sid = InputUtil.getString("Enter ID: ");
                        boolean present = InputUtil.getBoolean("Present (true/false): ");
                        service.markAttendance(sid, present);
                        break;

                    case 3:
                        service.displayAll();
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
    }
}

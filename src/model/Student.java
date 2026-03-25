package model;

public class Student extends User {
    private int totalClasses;
    private int attendedClasses;

    public Student(String name, String id) {
        super(name, id);
        totalClasses = 0;
        attendedClasses = 0;
    }

    public void markAttendance(boolean present) {
        totalClasses++;
        if (present) attendedClasses++;
    }

    public double getPercentage() {
        if (totalClasses == 0) return 0;
        return (attendedClasses * 100.0) / totalClasses;
    }

    public void displayDetails() {
        System.out.println(id + " - " + name);
        System.out.println("Attendance: " + attendedClasses + "/" + totalClasses);
        System.out.printf("Percentage: %.2f%%\n", getPercentage());
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}

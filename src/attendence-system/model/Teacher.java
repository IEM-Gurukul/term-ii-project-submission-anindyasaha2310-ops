package model;

public class Teacher extends User {

    public Teacher(String name, String id) {
        super(name, id);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

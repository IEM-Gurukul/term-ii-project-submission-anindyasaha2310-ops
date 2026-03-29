package model;

public abstract class User {
    protected String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.setId(id);
    }

    public abstract void displayRole();
    public string getId(){
        return id;
    }
    public void setId(string id){
        this.id=id;
    }
}

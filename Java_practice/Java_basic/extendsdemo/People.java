package Java_basic.extendsdemo;

public class People {

    private String name;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // proected method means it can be accessed by subclasses
    protected void displayInfo() {
        System.out.println("Name: " + name);
    }

    public void cry() {
        System.out.println("People cry");
    }

}

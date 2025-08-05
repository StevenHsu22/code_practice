package Java_basic.extendsdemo;

public class Consultant extends People {

    private String expertise;

    public Consultant() {
        // super(); // Calls the constructor of People class
    }

    public Consultant(String expertise) {
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

}

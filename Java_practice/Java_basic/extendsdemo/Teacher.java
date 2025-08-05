package Java_basic.extendsdemo;

public class Teacher extends People {

    
    private String subject;
    private int yearsOfExperience;
    private String schoolName;
    // public static final String SCHOOLNAME = "xx School"; 

    public Teacher() {
    } // Default constructor

    public Teacher(String subject, int yearsOfExperience) {
        // this constructor calls another constructor in the same class\
        // super(); // not needed, as Java automatically calls the no-arg constructor of People
        this(subject, yearsOfExperience, "xx School");
    }

    public Teacher(String subject, int yearsOfExperience, String schoolName) {
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.schoolName = schoolName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    // Overriding the method from People class
    // private and static can't override
    @Override
    public void cry() {
        System.out.println("Teacher cries");
    }
}

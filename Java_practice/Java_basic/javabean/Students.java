package Java_basic.javabean;

public class Students {

    // JavaBean features:
    // 1. Private fields
    // 2. Public no-argument constructor
    // 3. Public getter and setter methods for each field
    // 4. Serializable (not shown here, but typically implemented)
    private String name;
    private int chineseScore;
    private int mathScore;

    public Students() {
    } // Default constructor

    // cmd + . generate getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    // cmd + .
}

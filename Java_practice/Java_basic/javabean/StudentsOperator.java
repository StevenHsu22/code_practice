package Java_basic.javabean;

public class StudentsOperator {

    public void printTotalScore(Students student) {
        int totalScore = student.getChineseScore() + student.getMathScore();
        System.out.println("Total Score for " + student.getName() + ": " + totalScore);
    }
}

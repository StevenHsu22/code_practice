package Java_basic.extendsdemo;

public class Test {

    public static void main(String[] args) {
        // Create a Consultant object
        Consultant consultant = new Consultant();
        consultant.setName("Alice");
        consultant.setGender('F');
        consultant.setExpertise("Software Engineering");
        System.out.println("Consultant Name: " + consultant.getName());

    }

}

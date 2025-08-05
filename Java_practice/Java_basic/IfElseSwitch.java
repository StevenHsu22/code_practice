package Java_basic;

import java.math.BigDecimal;

public class IfElseSwitch {

    public static void main(String[] args) {
        int number = 10;
        // If-Else statement
        checkNumber(number);
        // Switch statement
        int day = 3; // Example day of the week
        evaluateDay(day);

        if (isBigDecimalEqual("0.1", "0.10")) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

    // Method to demonstrate if-else logic
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method to demonstrate switch logic
    // byte, short, int, char
    public static void evaluateDay(int day) {
        switch (day) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }

    /*
     * double a = 0.1 + 0.2; double b = 0.3; a!= b; // false
     */
    public static boolean isBigDecimalEqual(String aStr, String bStr) {
        BigDecimal a = new BigDecimal(aStr);
        BigDecimal b = new BigDecimal(bStr);
        return a.compareTo(b) == 0;
    }
}

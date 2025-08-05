package Java_basic;

public class Arrays {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        radomArrayExample();
        radomCall();
        inputScore();
        int a = getMaxScore(new int[]{10, 20, 30, 40, 50});
        System.out.println("Max score: " + a);
        twoDimensionalArrayExample();
    }

    public static void radomArrayExample() {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);
    }

    public static void radomCall() {

        String[] names = new String[]{"Alice", "Bob", "Charlie"};
        // Print the names in the array
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.print(name + " ");
        }

        int index = (int) (Math.random() * names.length);
        System.out.println("index:" + index);
        System.out.println("\nRandomly selected name: " + names[index]);
    }

    public static void inputScore() {
        // Example of an array to store scores
        int[] scores = new int[5];

        // Simulate inputting scores
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (i + 1) * 10; // Just an example, in real case you would take input from user
        }

        // Print the scores
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        // type -> scores.fori
        // for (int scores2 = 0; scores2 < scores.length; scores2++) {
        // }
    }

    public static int getMaxScore(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("\nMaximum score: " + max);
        return max;
    }

    // 2-dimensional array example
    public static void twoDimensionalArrayExample() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = new int[3][3];

        // Print the elements of the 2D array
        System.out.println("2D Array elements:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

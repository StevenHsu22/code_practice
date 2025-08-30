package Java_advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks for execution
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running");
                try {
                    Thread.sleep(2000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " is completed");
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

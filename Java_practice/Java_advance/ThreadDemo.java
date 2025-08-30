package Java_advance;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo {

    public static void main(String[] args) {
        // 1.
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main: " + i);
        }

        // 2.
        PrimeRun primeRun = new PrimeRun();
        Thread primeThread = new Thread(primeRun);
        primeThread.start();

        // 3.
        Callable<String> callable = new MyCallable(10);
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread callableThread = new Thread(futureTask);
        callableThread.start();

        try {
            String result = futureTask.get(); // blocking
            System.out.println(result);
        } catch (InterruptedException | java.util.concurrent.ExecutionException e) {
            e.printStackTrace();
        }

    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

class PrimeRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable: " + i);
        }
    }
}

class MyCallable implements Callable<String> {

    private final int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "Sum: " + sum;
    }
}

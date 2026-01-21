package org.example.interview;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThreadInNewWay {
    public static void main(String[] args) {
        ExecutorService threadService = Executors.newFixedThreadPool(3);
        Runnable task1 = () -> {
            System.out.println("Thread1");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Thread 1 finished");
        };
        Runnable task2 = () -> {

            System.out.println("Thread2");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Thread 2 finished");
        };
        task1.run();
        task2.run();
        task1.run();
        task2.run();
    }

}

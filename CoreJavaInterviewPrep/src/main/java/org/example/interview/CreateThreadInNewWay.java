package org.example.interview;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThreadInNewWay {
    public static void main(String[] args) {
        ExecutorService threadService = Executors.newFixedThreadPool(3);
        Runnable task1 = () -> System.out.println("Thread1");
        Runnable task2 = () -> System.out.println("Thread2");
        task1.run();
        task2.run();
    }

}

package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the ExecutorService for execution
        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskNumber + " executed by " + threadName);
            });
        }

        // Shutdown the ExecutorService when no longer needed
        executor.shutdown();
    }
}

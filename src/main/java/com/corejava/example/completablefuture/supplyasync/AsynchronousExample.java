package com.corejava.example.completablefuture.supplyasync;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashSet;
//Asynchronous code example in Java using CompletableFuture
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class AsynchronousExample {
 public static void main(String[] args) {
     System.out.println("Task 1 started");
     CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> performTask1());
     
     System.out.println("Task 2 started");
     CompletableFuture<Void> task2 = CompletableFuture.runAsync(() -> performTask2());
     
     CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2);
     
     // Wait for all tasks to complete
     allTasks.join();
 }

 public static void performTask1() {
     // Simulate a time-consuming task
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     System.out.println("Task 1 completed");
 }

 public static void performTask2() {
     // Simulate a time-consuming task
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     System.out.println("Task 2 completed");
 }
 

}


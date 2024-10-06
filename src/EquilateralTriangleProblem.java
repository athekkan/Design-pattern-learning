package com.athekkan.leet.code;

public class EquilateralTriangleProblem {
    public static void main(String[] args) {
        int n = 10;
        long startTime = System.nanoTime();
        soltuion2(n);
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.println("Total time taken for soltuion2 :" + timeTaken / 1_000_000.0 + " ms");


        long startTime1 = System.nanoTime();
        solution1(n);
        long endTime1 = System.nanoTime();
        long timeTaken1 = endTime1 - startTime1;
        System.out.println("Total time taken for soltuion1 :" + timeTaken1 / 1_000_000.0 + " ms");


    }

    public static void solution1(int n) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used for solution 1: " + (memoryAfter - memoryBefore) + " bytes");
    }


    public static void soltuion2(int n) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        StringBuilder builder = null ;

        for (int i = 1; i <= n; i++) {
            builder = new StringBuilder(" ".repeat(n-i)+"* ".repeat(i));
            System.out.println(builder);
        }
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used for solution 2: " + (memoryAfter - memoryBefore) + " bytes");
    }
}


 /*

 when n = 1000

        Memory used for solution 1: 21492872 bytes		21 MB
        Total time taken for soltuion1 :1701.0843 ms

        Memory used for solution 2: 1300952 bytes		1.3 MB
        Total time taken for soltuion2 :77.0116 ms

 when n = 10

        Memory used for solution 2: 976424 bytes
        Total time taken for soltuion2 :38.8725 ms

        Memory used for solution1: 39840 bytes
        Total time taken for solution1 :7.3009 ms

   solution1 is the optimized solution when n is small     but when n is large solution 2 is better

  */
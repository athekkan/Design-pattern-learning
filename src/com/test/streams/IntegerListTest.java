package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerListTest {
    public static void main(String[] args) {

        // Immutability
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        List<Integer> squares = numbers.stream().filter(num -> num%2 ==0)
                .map(num ->num * num).collect(Collectors.toList());
        squares.forEach(System.out::println);

        //Square root with Exception handling
        List<Integer> numList = List.of(16,23,-45,7,-1);
        List<Double> squareRoots = numList.stream()
                .map(n -> {
                    try {
                        return Math.sqrt(n);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Exception while converting to square root");
                        return Double.NaN;
                    }
                }).collect(Collectors.toList());
        squareRoots.forEach(System.out::println);

        // Parallel processing - Parallel streams enable us to execute code in parallel on separate cores , Uses the multipe system cores for large datasets
       //  the order of execution is out of our control
        long startTimeSequence = System.currentTimeMillis();
        int seqSum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total time in sequence Processing :"+(System.currentTimeMillis() - startTimeSequence) + " ms");

        long startTimeParallel = System.currentTimeMillis();
        int parallelSum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Total time in parallel Processing :"+(System.currentTimeMillis() - startTimeParallel) + " ms");

    }
}

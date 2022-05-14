package com.company.Task6;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Task6 {
    public static void main(String[] args) {

        final var number = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics result = number.stream()
                        .mapToInt(e -> e)
                                .summaryStatistics();

        System.out.println("Highest prime number in List : " + result.getMax());
        System.out.println("Lowest prime number in List : " + result.getMin());
        System.out.println("Sum of all prime numbers : " + result.getSum());
        System.out.println("Average of all prime numbers : " + result.getAverage());
    }
}

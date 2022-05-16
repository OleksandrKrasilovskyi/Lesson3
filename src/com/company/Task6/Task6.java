package com.company.Task6;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        final var number = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        System.out.println("Highest prime number in List : " + intSummaryStatics(number).getMax());
        System.out.println("Lowest prime number in List : " + intSummaryStatics(number).getMin());
        System.out.println("Sum of all prime numbers : " + intSummaryStatics(number).getSum());
        System.out.println("Average of all prime numbers : " + intSummaryStatics(number).getAverage());
    }

    public static IntSummaryStatistics intSummaryStatics(final List<Integer> numbers) {

        return numbers.stream()
                .mapToInt(e -> e)
                .summaryStatistics();
    }
}

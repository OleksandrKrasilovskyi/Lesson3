package com.company.Task5;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        final var objects = List.of(10, 4, 5, 6, 4, 9, 6);

        System.out.println(findSquareAndDistinct(objects));
    }

    public static List<Integer> findSquareAndDistinct(final List<Integer> numbers) {

        return numbers.stream()
                .map(e -> e * e)
                .distinct()
                .collect(Collectors.toList());
    }
}

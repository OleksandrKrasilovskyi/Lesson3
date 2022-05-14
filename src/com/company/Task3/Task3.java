package com.company.Task3;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        final List<Long> list = List.of(1L, 2L, 3L, 4L);
        System.out.println(calculateAverage(list));
    }
    public static double calculateAverage(List<Long> longList) {

        return longList.stream()
                .mapToLong(Math::toIntExact)
                .average().orElse(0);
    }
}

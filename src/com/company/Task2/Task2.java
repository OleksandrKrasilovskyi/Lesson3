package com.company.Task2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        final var list = List.of("one", "two", "three", "four", "five");

        System.out.println(groupByStringLength(list));
    }

    public static Map<Integer, List<String>> groupByStringLength(final List<String> stringList) {

        return stringList.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
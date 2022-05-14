package com.company.Task4;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        final var list = List.of("one", "", "three", "", "five");

        System.out.println(findAmountOfEmptyStrings(list));
    }

    public static long findAmountOfEmptyStrings(final List<String> stringList) {

        return stringList.stream()
                .filter(String::isEmpty)
                .count();
    }
}

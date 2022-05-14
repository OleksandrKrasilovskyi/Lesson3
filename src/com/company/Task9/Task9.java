package com.company.Task9;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {

        final var list = List.of("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow");
        System.out.println(convertListToSortedMap(list));
    }

    public static Map<String, Integer> convertListToSortedMap(final List<String> strings) {

        return strings.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (Previous, New) -> New, TreeMap::new));
    }
}

package com.company.Task10;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {

        final var list = List.of("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow", "GoDaddy");
        System.out.println(convertListToSortedMap(list));
    }

    public static Map<Integer, String> convertListToSortedMap(final List<String> strings) {

        return strings.stream()
                .collect(Collectors.toMap(String::length, Function.identity(), (previous, neww) -> {
                    throw new IllegalArgumentException("Keys are the duplicated: " + neww);
                }, TreeMap::new));
    }
}




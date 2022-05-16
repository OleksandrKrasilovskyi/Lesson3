package com.company.Task8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class Task8 {
    public static void main(String[] args) {

        final var list = List.of("Bluehost", "Amazon AWS", "LiquidWeb", "FatCow", "GoDaddy");

        System.out.println(convertListToLinkedHashMap(list));
    }

    public static Map<String, Integer> convertListToLinkedHashMap(final List<String> strings) {

        return strings.stream()
                .collect(toMap(Function.identity(), String::length, (e1, e2) -> e2, LinkedHashMap::new));

    }
}
